package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;
import java.util.Collections;
import java.util.Set;
import kotlin.Pair;
import ru.ok.android.webrtc.media_options.MediaOption;
import xsna.dw20;
import xsna.srw0;

/* compiled from: CallMediaRequestDialog.kt */
/* loaded from: classes7.dex */
public final class w59 extends ug6 {
    public static final /* synthetic */ int k1 = 0;

    /* compiled from: CallMediaRequestDialog.kt */
    public static final class a extends dw20.b {
        public final String e;

        public a(Context context, String str) {
            super(context, tzp0.a(null, 3));
            this.e = str;
            p0(0);
            n0(0);
            o0(0);
            m0(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            w59 w59Var = new w59();
            w59Var.setArguments(yfb.b(new Pair("screen", new VoipAnalyticsEventScreen(this.e))));
            return w59Var;
        }
    }

    @Override // xsna.ug6
    public final void Zn() {
        bo(rl3.y0(new MediaOption[]{MediaOption.AUDIO, MediaOption.VIDEO}));
    }

    @Override // xsna.ug6
    public final void ao() {
        bo(Collections.singleton(MediaOption.AUDIO));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bo(Set<? extends MediaOption> set) {
        String str;
        Parcelable parcelable;
        Object parcelable2;
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.b0().e(set);
        kdw0 kdw0Var = (kdw0) this.f1.getValue();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("screen", VoipAnalyticsEventScreen.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("screen");
                if (!(parcelable3 instanceof VoipAnalyticsEventScreen)) {
                    parcelable3 = null;
                }
                parcelable = (VoipAnalyticsEventScreen) parcelable3;
            }
            VoipAnalyticsEventScreen voipAnalyticsEventScreen = (VoipAnalyticsEventScreen) parcelable;
            str = voipAnalyticsEventScreen != null ? voipAnalyticsEventScreen.b : null;
        }
        str = "";
        kdw0Var.b(new srw0.b.a(str, srw0.d.a.a, set));
    }
}
