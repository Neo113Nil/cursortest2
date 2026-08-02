package xsna;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.i330;
import xsna.mbv;

/* compiled from: HolidayInteractionView.kt */
/* loaded from: classes7.dex */
public final class cbv {
    public final ViewGroup a;
    public final TextView b;
    public final GradientDrawable c;
    public final TextView d;
    public final View e;
    public final TextView f;
    public final View g;
    public final TextView h;
    public final VKImageView i;
    public final GradientDrawable j;
    public final TextView k;
    public final View l;
    public final TextView m;
    public final TextView n;
    public final i330<mbv> o;
    public final io.reactivex.rxjava3.subjects.f<lbv> p;
    public final io.reactivex.rxjava3.subjects.d<Integer> q;
    public final io.reactivex.rxjava3.subjects.d<mbv> r;
    public boolean s;

    /* compiled from: HolidayInteractionView.kt */
    public static abstract class a {

        /* compiled from: HolidayInteractionView.kt */
        /* renamed from: xsna.cbv$a$a, reason: collision with other inner class name */
        public static final class C2656a extends a {
            public final int a;

            public C2656a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2656a) && this.a == ((C2656a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("BottomBlock(height="), this.a, ')');
            }
        }

        /* compiled from: HolidayInteractionView.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: HolidayInteractionView.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    public cbv(mjw0 mjw0Var) {
        ViewGroup viewGroup = (ViewGroup) mjw0Var.findViewById(R.id.voip_holiday_interaction_request_container);
        this.a = viewGroup;
        TextView textView = (TextView) mjw0Var.findViewById(R.id.voip_holiday_interaction_request_button);
        this.b = textView;
        Drawable background = textView.getBackground();
        this.c = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        TextView textView2 = (TextView) mjw0Var.findViewById(R.id.voip_holiday_interaction_hide_request_button);
        this.d = textView2;
        this.e = mjw0Var.findViewById(R.id.voip_holiday_interaction_overlay_view);
        this.f = (TextView) mjw0Var.findViewById(R.id.voip_holiday_interaction_message);
        View findViewById = mjw0Var.findViewById(R.id.voip_holiday_interaction_cancel_button);
        this.g = findViewById;
        this.h = (TextView) mjw0Var.findViewById(R.id.voip_holiday_interaction_cancel_text_view);
        VKImageView vKImageView = (VKImageView) mjw0Var.findViewById(R.id.voip_holiday_interaction_accept_button);
        this.i = vKImageView;
        Drawable background2 = vKImageView.getBackground();
        this.j = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        this.k = (TextView) mjw0Var.findViewById(R.id.voip_holiday_interaction_accept_text_view);
        View findViewById2 = mjw0Var.findViewById(R.id.voip_holiday_interaction_hint_container);
        this.l = findViewById2;
        this.m = (TextView) mjw0Var.findViewById(R.id.voip_holiday_interaction_hint_title);
        this.n = (TextView) mjw0Var.findViewById(R.id.voip_holiday_interaction_hint_message);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(new bod(2), new vam(this, 16), new kxa((byte) 0, 5)));
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        arrayList2.add(new i330.b(dbv.b, new t50(1, this, cbv.class, "onIdleBottomInsetChanged", "onIdleBottomInsetChanged(I)V", 0, 8), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(ebv.b, new fbv(1, this, cbv.class, "onIdleStaticDataChanged", "onIdleStaticDataChanged(Lcom/vk/voip/ui/holiday_interaction/view/HolidayInteractionViewModel$Idle$StaticData;)V", 0), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(gbv.b, new hbv(1, this, cbv.class, "onIdleHintChanged", "onIdleHintChanged(Lcom/vk/voip/ui/holiday_interaction/view/HolidayInteractionViewModel$Idle$Hint;)V", 0), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(mbv.b.class), new i330(arrayList2, hashMap2));
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        arrayList3.add(new i330.b(new bqt(1), new ibv(1, this, cbv.class, "onRequestSentChanged", "onRequestSentChanged(Lcom/vk/voip/ui/holiday_interaction/view/HolidayInteractionViewModel$RequestSent;)V", 0), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(mbv.e.class), new i330(arrayList3, hashMap3));
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        arrayList4.add(new i330.b(new l8k(9), new jbv(1, this, cbv.class, "onRequestReceivedChanged", "onRequestReceivedChanged(Lcom/vk/voip/ui/holiday_interaction/view/HolidayInteractionViewModel$RequestReceived;)V", 0), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(mbv.d.class), new i330(arrayList4, hashMap4));
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap5 = new HashMap();
        arrayList5.add(new i330.b(new com(9), new kbv(1, this, cbv.class, "onInProgressChanged", "onInProgressChanged(Lcom/vk/voip/ui/holiday_interaction/view/HolidayInteractionViewModel$InProgress;)V", 0), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(mbv.c.class), new i330(arrayList5, hashMap5));
        this.o = new i330<>(arrayList, hashMap);
        this.p = new io.reactivex.rxjava3.subjects.f<>();
        this.q = io.reactivex.rxjava3.subjects.d.O0(0);
        this.r = io.reactivex.rxjava3.subjects.d.O0(mbv.a.a);
        jjc.g(textView, new vfk(this, 15));
        jjc.g(textView2, new eqq(this, 8));
        jjc.g(findViewById, new t9e(this, 27));
        jjc.g(vKImageView, new dkg(this, 22));
        bwt0.R(viewGroup, new ljj(this, 2));
        jjc.g(findViewById2, new qpj(this, 18));
        q1i0 q1i0Var = new q1i0(mjw0Var.getContext(), R.drawable.vk_bg_tip_no_tail_center, R.drawable.vk_bg_tip_tail_bottom_center);
        q1i0Var.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
        q1i0Var.j = true;
        findViewById2.setBackground(q1i0Var);
    }
}
