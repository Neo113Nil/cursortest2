package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.unity3d.services.UnityAdsConstants;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: StoryLifetimeBottomSheet.kt */
/* loaded from: classes16.dex */
public final class g5m0 extends dw20 {
    public final int f1;
    public final izs<Integer, s3q0> g1;
    public final izs<StoryEditorEvents, s3q0> h1;
    public boolean i1;
    public int j1;
    public final h5m0 k1 = new h5m0(this);

    /* compiled from: StoryLifetimeBottomSheet.kt */
    public static final class a extends dw20.b {
        public final int e;
        public final h57 f;
        public final ut30 g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context, int i, h57 h57Var, ut30 ut30Var) {
            super((r0 == null || r0.intValue() != dhr0.u().c) ? new l7s(context, dhr0.u().c) : context, null);
            lpj lpjVar = context instanceof lpj ? (lpj) context : null;
            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
            dhr0.a.getClass();
            this.e = i;
            this.f = h57Var;
            this.g = ut30Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            v(0);
            x(0);
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            return new g5m0(this.e, this.f, this.g);
        }
    }

    public g5m0(int i, h57 h57Var, ut30 ut30Var) {
        this.f1 = i;
        this.g1 = h57Var;
        this.h1 = ut30Var;
        this.j1 = i;
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d
    public final void tn() {
        Qn(true);
        super.tn();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        if (r6.a(r5) != false) goto L8;
     */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Dialog yn(Bundle bundle) {
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(new ContextThemeWrapper(mo2getContext, dhr0.u().c)).inflate(R.layout.layout_story_lifetime, (ViewGroup) null, false);
        if (inflate != null) {
            RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.hour_1);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.hour_12);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(R.id.hour_24);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(R.id.hour_48);
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_LIFETIME_48;
            storiesFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (!bVar.a(storiesFeatures)) {
                StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_STORY_LIFETIME_COMM_48;
                storiesFeatures2.getClass();
            }
            radioButton.setVisibility(8);
            radioButton2.setVisibility(8);
            int i = this.f1;
            if (i == 1) {
                radioButton.setChecked(true);
            } else if (i == 12) {
                radioButton2.setChecked(true);
            } else if (i == 24) {
                radioButton3.setChecked(true);
            } else if (i != 48) {
                radioButton3.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.b5m0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        g5m0 g5m0Var = g5m0.this;
                        g5m0Var.h1.invoke(StoryEditorEvents.CLICK_1H);
                        g5m0Var.j1 = 1;
                    }
                }
            });
            radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.c5m0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        g5m0 g5m0Var = g5m0.this;
                        g5m0Var.h1.invoke(StoryEditorEvents.CLICK_12H);
                        g5m0Var.j1 = 12;
                    }
                }
            });
            radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.d5m0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        g5m0 g5m0Var = g5m0.this;
                        g5m0Var.h1.invoke(StoryEditorEvents.CLICK_24H);
                        g5m0Var.j1 = 24;
                    }
                }
            });
            radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.e5m0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        g5m0 g5m0Var = g5m0.this;
                        g5m0Var.h1.invoke(StoryEditorEvents.CLICK_48H);
                        g5m0Var.j1 = 48;
                    }
                }
            });
            bwt0.i0(inflate.findViewById(R.id.confirm), new z6f0(this, 14));
            dw20.Rn(this, inflate, 6);
            this.e0 = new d5j(inflate);
        }
        Dialog yn = super.yn(bundle);
        final b33 b33Var = (b33) yn;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.f5m0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ww50 v = s200.v(b33.this.getContext());
                if (v != null) {
                    v.S(this.k1);
                }
            }
        });
        return yn;
    }
}
