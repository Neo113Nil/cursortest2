package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.util.Size;
import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.WeakHashMap;
import xsna.ikv0;
import xsna.iut0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class t1s0 implements izs {
    public final /* synthetic */ VideoFile b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ContextWrapper e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ t1s0(VideoFile videoFile, boolean z, boolean z2, ContextWrapper contextWrapper, irt irtVar, String str, String str2) {
        this.b = videoFile;
        this.c = z;
        this.d = z2;
        this.e = contextWrapper;
        this.f = str;
        this.g = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        h4x i;
        boolean z = this.c;
        VideoFile videoFile = this.b;
        wjs0.a(new oxr0(videoFile, !z));
        if (z) {
            return s3q0.a;
        }
        int i2 = 0;
        if (this.d) {
            ContextWrapper contextWrapper = this.e;
            b7v b7vVar = new b7v(contextWrapper, videoFile, this.f, this.g, 1);
            Activity h = e3m.h(contextWrapper);
            if (h != null) {
                View decorView = h.getWindow().getDecorView();
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                bqx0 a = iut0.e.a(decorView);
                if (a != null && (i = a.a.i(2)) != null) {
                    i2 = i.d;
                }
            }
            ikv0.a aVar = new ikv0.a(contextWrapper);
            float f = 28;
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(iah0.a(f), iah0.a(f)), 8);
            aVar.u = new ikv0.d(contextWrapper.getString(R.string.video_not_interested_hidden), (String) null, (ikv0.d.a) null, 6);
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, contextWrapper.getString(R.string.cancel), b7vVar);
            aVar.o = Integer.valueOf(iah0.a(8) + i2);
            pkv0.f(aVar);
        } else {
            cvk.u(R.string.video_not_interested_hidden, false);
        }
        return s3q0.a;
    }
}
