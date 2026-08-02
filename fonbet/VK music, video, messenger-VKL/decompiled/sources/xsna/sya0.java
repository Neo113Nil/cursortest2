package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import kotlin.collections.EmptyList;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.g9m;
import xsna.qwm;

/* compiled from: PlaybackSpeedDialog.kt */
/* loaded from: classes8.dex */
public final class sya0 extends gk6<mk80, a> {
    public static final /* synthetic */ int A = 0;
    public final int w;
    public rwm x;
    public final c y;
    public final b z;

    /* compiled from: PlaybackSpeedDialog.kt */
    public static final class a extends g9m.a {
        public final float c;
        public final boolean d;

        public a(float f, boolean z) {
            super((int) (100 * f), true);
            this.c = f;
            this.d = z;
        }
    }

    /* compiled from: PlaybackSpeedDialog.kt */
    public static final class b implements m37<mk80, a> {
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // xsna.m37
        public final void a(mk80 mk80Var, a aVar) {
            String valueOf;
            mk80 mk80Var2 = mk80Var;
            a aVar2 = aVar;
            AppCompatTextView appCompatTextView = mk80Var2.c;
            int i = sya0.A;
            float f = aVar2.c;
            if (f == 1.0f) {
                valueOf = this.b.getString(R.string.one_video_playback_speed_normal);
            } else {
                int i2 = (int) f;
                valueOf = f - ((float) i2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? String.valueOf(i2) : String.valueOf(f);
            }
            appCompatTextView.setText(valueOf);
            mk80Var2.a.setSelected(aVar2.d);
        }

        @Override // xsna.m37
        public final xtt0 b(int i, ViewGroup viewGroup) {
            return mk80.a(sya0.this.getLayoutInflater(), viewGroup);
        }
    }

    /* compiled from: PlaybackSpeedDialog.kt */
    public static final class c implements one.video.player.f {
        public c() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void o(BaseVideoPlayer baseVideoPlayer, float f) {
            sya0.this.w(f);
        }
    }

    public sya0(Context context, OneVideoPlayer oneVideoPlayer) {
        super(context, oneVideoPlayer);
        this.w = R.id.one_video_dialog_speed_tag;
        this.y = new c();
        this.z = new b(context);
    }

    @Override // xsna.tc6, com.google.android.material.bottomsheet.b, xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w(this.v.b());
    }

    @Override // xsna.tc6
    public final m37<mk80, a> r() {
        return this.z;
    }

    @Override // xsna.tc6
    public final int t() {
        return this.w;
    }

    @Override // xsna.tc6
    public final void u(g9m.a aVar) {
        float f = ((a) aVar).c;
        this.v.setPlaybackSpeed(f);
        rwm rwmVar = this.x;
        if (rwmVar != null) {
            rwmVar.a(new qwm.b(f));
        }
        dismiss();
    }

    @Override // xsna.gk6
    public final OneVideoPlayer.c v() {
        return this.y;
    }

    public final void w(float f) {
        Collection collection;
        float[] p0 = this.v.p0();
        if (p0.length == 0) {
            collection = EmptyList.b;
        } else {
            ArrayList arrayList = new ArrayList(p0.length);
            for (float f2 : p0) {
                arrayList.add(Float.valueOf(f2));
            }
            Collections.reverse(arrayList);
            collection = arrayList;
        }
        float[] L0 = j5g.L0(collection);
        androidx.recyclerview.widget.x xVar = this.t;
        if (xVar == null) {
            xVar = null;
        }
        ArrayList arrayList2 = new ArrayList(L0.length);
        int length = L0.length;
        for (int i = 0; i < length; i++) {
            float f3 = L0[i];
            arrayList2.add(new a(f3, f3 == f));
        }
        xVar.submitList(arrayList2);
    }
}
