package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;
import xsna.wed0;
import xsna.xn50;

/* compiled from: PrivacySettingsModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class cfd0 extends tl50<afd0, lfd0, wed0> {
    public static final /* synthetic */ qcy<Object>[] q1;
    public final nf3 i1 = new nf3();
    public bfd0 j1;
    public final Object k1;
    public final bpn0 l1;
    public final bpn0 m1;
    public final bx80 n1;
    public final b o1;
    public final c p1;

    /* compiled from: PrivacySettingsModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final PostPrivacyData h;
        public final bfd0 i;

        public a(Context context, PostPrivacyData postPrivacyData, bfd0 bfd0Var) {
            super(context, tzp0.a(null, 1));
            this.h = postPrivacyData;
            this.i = bfd0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            x(0);
            B(cn70.c(12), true, true);
            m(R.attr.vk_ui_background_modal);
            R0(false);
            cfd0 cfd0Var = new cfd0();
            Bundle a = yfb.a();
            a.putParcelable("PRIVACY_DATA", this.h);
            cfd0Var.setArguments(a);
            cfd0Var.j1 = this.i;
            return cfd0Var;
        }
    }

    /* compiled from: PrivacySettingsModalBottomSheet.kt */
    public static final class b extends BroadcastReceiver {
        public final boolean a;
        public final d b;

        public b(boolean z, d dVar) {
            this.a = z;
            this.b = dVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Parcelable parcelable;
            Object parcelableExtra;
            String action = intent != null ? intent.getAction() : null;
            if (action != null && action.hashCode() == -336160953 && action.equals("com.vk.newsfeed.posting.BROADCAST_DONUT_LEVELS")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("com.vk.newsfeed.posting.BROADCAST_DONUT_LEVELS_SELECTED_LEVEL", DonutLevel.class);
                    parcelable = (Parcelable) parcelableExtra;
                } else {
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("com.vk.newsfeed.posting.BROADCAST_DONUT_LEVELS_SELECTED_LEVEL");
                    if (!(parcelableExtra2 instanceof DonutLevel)) {
                        parcelableExtra2 = null;
                    }
                    parcelable = (DonutLevel) parcelableExtra2;
                }
                DonutLevel donutLevel = (DonutLevel) parcelable;
                if (donutLevel == null) {
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra("com.vk.newsfeed.posting.BROADCAST_POSTING_SCREEN_UNIQUE_ID");
                UUID uuid = serializableExtra instanceof UUID ? (UUID) serializableExtra : null;
                PrivacyPostType.SingleDonutLevel singleDonutLevel = new PrivacyPostType.SingleDonutLevel(donutLevel);
                boolean z = this.a;
                d dVar = this.b;
                if (z) {
                    dVar.invoke(new wed0.c(singleDonutLevel, uuid));
                } else {
                    dVar.invoke(new wed0.b(singleDonutLevel, false, uuid));
                }
            }
        }
    }

    /* compiled from: PrivacySettingsModalBottomSheet.kt */
    public static final class c implements fcn {
        public c() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            cfd0.this.hide();
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* compiled from: PrivacySettingsModalBottomSheet.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<wed0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(wed0 wed0Var) {
            cfd0 cfd0Var = (cfd0) this.receiver;
            cfd0Var.getClass();
            xn50.a.c(cfd0Var, wed0Var);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cfd0.class, "contentView", "getContentView()Lcom/vk/mvi/compose/vk/VkMviComposeView;", 0);
        fpf0.a.getClass();
        q1 = new qcy[]{mutablePropertyReference1Impl};
    }

    public cfd0() {
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new x84(29));
        this.k1 = a2;
        this.l1 = new bpn0(new lbc0(this, 4));
        this.m1 = new bpn0(new m130(this, 28));
        this.n1 = new bx80(this, 4);
        this.o1 = new b(((Boolean) a2.getValue()).booleanValue(), new d(1, this, cfd0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.p1 = new c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        i6v0 yed0Var;
        if (((Boolean) this.k1.getValue()).booleanValue()) {
            yed0Var = new com.vk.newsfeed.posting.privacy_picker.presentation.a(requireContext(), this);
            vq.b(-1, -2, yed0Var.d);
        } else {
            yed0Var = new yed0(this, requireContext());
        }
        qcy<Object>[] qcyVarArr = q1;
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = yed0Var;
        this.e0 = new jgj(((i6v0) nf3Var.getValue(this, qcyVarArr[0])).c(), 0, 0, 30);
        return new mk50.c(((i6v0) nf3Var.getValue(this, qcyVarArr[0])).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((i6v0) this.i1.getValue(this, q1[0])).f((lfd0) ao50Var, new m8(1, this, cfd0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 10));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        afd0 afd0Var = (afd0) vk50Var;
        afd0Var.h.a(new ml1(21, this, afd0Var), this);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ww50<?> Y;
        super.onCreate(bundle);
        LayoutInflater.Factory activity = getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            Y.S(this.p1);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vk.newsfeed.posting.BROADCAST_POSTING_ADDITIONAL_SETTINGS");
        intentFilter.addAction("com.vk.newsfeed.posting.BROADCAST_DONUT_LEVELS");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        anj.d(context, this.o1, intentFilter, null, 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ww50<?> Y;
        super.onDestroy();
        LayoutInflater.Factory activity = getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        Y.H(this.p1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("PRIVACY_DATA", PostPrivacyData.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("PRIVACY_DATA");
            if (!(parcelable3 instanceof PostPrivacyData)) {
                parcelable3 = null;
            }
            parcelable = (PostPrivacyData) parcelable3;
        }
        return new afd0((PostPrivacyData) parcelable, ((BridgeComponent) this.m1.getValue()).t().b(), ((Boolean) this.k1.getValue()).booleanValue());
    }
}
