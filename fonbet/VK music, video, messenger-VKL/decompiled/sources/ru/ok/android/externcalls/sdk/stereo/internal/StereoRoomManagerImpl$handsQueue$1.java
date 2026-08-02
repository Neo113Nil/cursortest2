package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.gzs;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: StereoRoomManagerImpl.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class StereoRoomManagerImpl$handsQueue$1 extends FunctionReferenceImpl implements wzs<List<? extends CallParticipant.ParticipantId>, gzs<? extends s3q0>, s3q0> {
    public StereoRoomManagerImpl$handsQueue$1(Object obj) {
        super(2, obj, StereoRoomManagerImpl.class, "resolveIdsAndThen", "resolveIdsAndThen(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ s3q0 invoke(List<? extends CallParticipant.ParticipantId> list, gzs<? extends s3q0> gzsVar) {
        invoke2((List<CallParticipant.ParticipantId>) list, (gzs<s3q0>) gzsVar);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<CallParticipant.ParticipantId> list, gzs<s3q0> gzsVar) {
        ((StereoRoomManagerImpl) this.receiver).resolveIdsAndThen(list, gzsVar);
    }
}
