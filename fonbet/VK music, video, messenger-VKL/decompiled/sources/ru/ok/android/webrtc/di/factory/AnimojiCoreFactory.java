package ru.ok.android.webrtc.di.factory;

import org.webrtc.EglBase;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AnimojiCoreFactory {
    public final SharedPeerConnectionFactory a;
    public final RTCLog b;
    public final MappingProcessor c;
    public final AnimojiDataSupplierInterface d;
    public final MutableMediaSettings e;
    public final EglBase f;

    public AnimojiCoreFactory(SharedPeerConnectionFactory sharedPeerConnectionFactory, RTCLog rTCLog, MappingProcessor mappingProcessor, AnimojiDataSupplierInterface animojiDataSupplierInterface, MutableMediaSettings mutableMediaSettings, EglBase eglBase) {
        this.a = sharedPeerConnectionFactory;
        this.b = rTCLog;
        this.c = mappingProcessor;
        this.d = animojiDataSupplierInterface;
        this.e = mutableMediaSettings;
        this.f = eglBase;
    }

    public final AnimojiCore createAnimojiCore(Call call) {
        return new AnimojiCore(call, this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public /* synthetic */ AnimojiCoreFactory(SharedPeerConnectionFactory sharedPeerConnectionFactory, RTCLog rTCLog, MappingProcessor mappingProcessor, AnimojiDataSupplierInterface animojiDataSupplierInterface, MutableMediaSettings mutableMediaSettings, EglBase eglBase, int i, zcl zclVar) {
        this(sharedPeerConnectionFactory, rTCLog, mappingProcessor, animojiDataSupplierInterface, (i & 16) != 0 ? null : mutableMediaSettings, eglBase);
    }
}
