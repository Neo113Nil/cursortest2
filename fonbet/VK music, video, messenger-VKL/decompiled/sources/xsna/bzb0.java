package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.common.view.settings.RadioButtonGroupSettingsView;
import com.vk.common.view.settings.RadioButtonSettingsView;
import com.vk.core.ui.utils.ItemType;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.im.engine.models.ProfilesInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.asb;
import xsna.cwb0;
import xsna.dw20;
import xsna.e3m;
import xsna.h7u0;

/* compiled from: PopupVc.kt */
@ozl
/* loaded from: classes2.dex */
public final class bzb0 {
    public static final Object j = new Object();
    public final Context a;
    public final bpn0 b = new bpn0(new rf20(this, 11));
    public final jxb0 c = new jxb0(0);
    public androidx.appcompat.app.d d;
    public ner0 e;
    public androidx.appcompat.app.d f;
    public VkContextMenu g;
    public dw20 h;
    public androidx.appcompat.app.d i;

    /* compiled from: PopupVc.kt */
    public static final class a extends BaseAdapter {
        public final Context b;
        public final ArrayList c;
        public final LayoutInflater d;

        public a(Context context, ArrayList arrayList) {
            this.b = context;
            this.c = arrayList;
            this.d = e3m.b(context);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.c.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return (jwb0) this.c.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            ColorStateList valueOf;
            if (view == null) {
                view = this.d.inflate(R.layout.vkim_popup_actions_item, viewGroup, false);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.icon);
            TextView textView = (TextView) view.findViewById(R.id.label);
            jwb0 jwb0Var = (jwb0) this.c.get(i);
            Drawable drawable = jwb0Var.c;
            CharSequence charSequence = jwb0Var.a;
            int i2 = jwb0Var.e;
            if (drawable != null) {
                appCompatImageView.setImageDrawable(drawable);
            } else if (i2 != 0) {
                appCompatImageView.setImageResource(i2);
            } else {
                appCompatImageView.setImageDrawable(null);
            }
            if (drm0.N(charSequence)) {
                int i3 = jwb0Var.b;
                if (i3 != 0) {
                    textView.setText(i3);
                } else {
                    textView.setText("");
                }
            } else {
                textView.setText(charSequence);
            }
            boolean z = jwb0Var.h;
            Context context = this.b;
            if (z) {
                valueOf = ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_negative, context));
            } else {
                Integer num = jwb0Var.d;
                valueOf = num != null ? ColorStateList.valueOf(num.intValue()) : ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent, context));
            }
            appCompatImageView.setImageTintList(valueOf);
            textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
            bwt0.p0(appCompatImageView, (jwb0Var.c == null && i2 == 0) ? false : true);
            return view;
        }
    }

    public bzb0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(bzb0 bzb0Var, cwb0.a1 a1Var, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, int i) {
        gzs gzsVar4 = (i & 2) != 0 ? null : gzsVar;
        gzs gzsVar5 = (i & 4) != 0 ? null : gzsVar2;
        gzs gzsVar6 = (i & 8) != 0 ? null : gzsVar3;
        Context context = bzb0Var.a;
        CharSequence charSequence = a1Var.i;
        int i2 = a1Var.h;
        CharSequence charSequence2 = a1Var.g;
        int i3 = a1Var.f;
        String str = a1Var.e;
        int i4 = a1Var.d;
        String str2 = a1Var.c;
        int i5 = a1Var.b;
        bzb0Var.a();
        cwb0.c1 c1Var = a1Var.k;
        if (epx.f(c1Var, cwb0.c1.c.a)) {
            p5y p5yVar = new p5y(bzb0Var, 22);
            if (i5 != 0) {
                str2 = context.getString(i5);
            }
            if (i4 != 0) {
                str = context.getString(i4);
            }
            if (i3 != 0) {
                charSequence2 = context.getString(i3);
            }
            if (i2 != 0) {
                charSequence = context.getString(i2);
            }
            h7u0.a aVar = new h7u0.a(context);
            aVar.h0(str2);
            int length = str.length();
            AlertController.b bVar = aVar.a;
            if (length > 0) {
                bVar.f = str;
            }
            aVar.c = true;
            aVar.d0(charSequence2, new oyb0(0, gzsVar4));
            aVar.X(charSequence, new ja60(1, gzsVar5));
            aVar.a0(new q1i(p5yVar, 1));
            bVar.n = new ryb0(0, gzsVar6);
            bzb0Var.d = aVar.m();
            return;
        }
        if (!epx.f(c1Var, cwb0.c1.b.a)) {
            throw new IllegalArgumentException();
        }
        dw20.b N = new dw20.b(context, null).N(a1Var.j);
        if (str2.length() <= 0) {
            str2 = i5 != 0 ? context.getString(i5) : "";
        }
        dw20.b w0 = N.w0(str2);
        if (str.length() <= 0) {
            str = i4 != 0 ? context.getString(i4) : "";
        }
        dw20.a R = dw20.a.R(w0, str, 0, 0, 6);
        if (i3 != 0) {
            ((dw20.b) R).h0(i3, gzsVar4 == null ? new xu0(27) : gzsVar4);
        }
        if (i2 != 0) {
            ((dw20.b) R).T(i2, gzsVar5 == null ? new yv2(27) : gzsVar5);
        }
        if (charSequence2.length() > 0) {
            ((dw20.b) R).j0(charSequence2, new qt9(2, gzsVar4));
        }
        if (charSequence.length() > 0) {
            ((dw20.b) R).j0(charSequence, new xiw(1, gzsVar5));
        }
        dw20.b a0 = ((dw20.b) R).a0(new tj2(19));
        if (gzsVar6 == null) {
            gzsVar6 = new nd1(29);
        }
        bzb0Var.h = a0.X(gzsVar6).I0(null);
    }

    public static void e(bzb0 bzb0Var, cwb0.b1 b1Var, izs izsVar) {
        bzb0Var.a();
        if (!epx.f(b1Var.h, cwb0.c1.c.a)) {
            throw new IllegalArgumentException();
        }
        Iterable iterable = b1Var.i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (j5g.P(b1Var.j, ((jwb0) obj).f)) {
                arrayList.add(obj);
            }
        }
        Context context = bzb0Var.a;
        int i = b1Var.a;
        CharSequence charSequence = b1Var.b;
        int i2 = b1Var.c;
        String str = b1Var.d;
        SpannableStringBuilder spannableStringBuilder = b1Var.e;
        int i3 = b1Var.f;
        String str2 = b1Var.g;
        pp00 pp00Var = new pp00(bzb0Var, 22);
        if (i != 0) {
            charSequence = context.getString(i);
        }
        CharSequence charSequence2 = charSequence;
        if (i2 != 0) {
            str = context.getString(i2);
        }
        if (i3 != 0) {
            str2 = context.getString(i3);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jwb0 jwb0Var = (jwb0) it.next();
            int i4 = jwb0Var.b;
            arrayList2.add(i4 == 0 ? jwb0Var.a : context.getText(i4));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.vkim_popup_list_multichoice_item, android.R.id.text1, arrayList2);
        View inflate = e3m.b(context).inflate(R.layout.vkim_popup_msg_with_list, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_msg);
        if (str.length() > 0) {
            textView.setText(str);
        }
        ListView listView = (ListView) inflate.findViewById(R.id.lv_items);
        listView.setAdapter((ListAdapter) arrayAdapter);
        listView.setChoiceMode(2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.btn_negative);
        textView2.setText(str2);
        jjc.g(textView2, new bk30(ref$ObjectRef, 17));
        TextView textView3 = (TextView) inflate.findViewById(R.id.btn_positive);
        textView3.setText(spannableStringBuilder);
        jjc.g(textView3, new wb30(1, ref$ObjectRef, arrayList, izsVar, listView));
        h7u0.a aVar = new h7u0.a(context);
        aVar.b0(new DialogInterface.OnShowListener() { // from class: xsna.wyb0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Ref$ObjectRef.this.element = dialogInterface;
            }
        });
        aVar.h0(charSequence2);
        aVar.f = inflate;
        aVar.c = true;
        aVar.a0(new yyb0(pp00Var, 0));
        aVar.a.n = new xyb0();
        bzb0Var.d = aVar.m();
    }

    public static czb0 h(bzb0 bzb0Var, cwb0.m mVar, izs izsVar, FrameLayout frameLayout) {
        bzb0Var.a();
        return bzb0Var.g(mVar, izsVar, null, new ll1(21, bzb0Var, frameLayout));
    }

    public final void a() {
        ((ntl) this.b.getValue()).getClass();
        ((Handler) this.c.b).removeCallbacksAndMessages(j);
        androidx.appcompat.app.d dVar = this.d;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.d = null;
        ner0 ner0Var = this.e;
        if (ner0Var != null) {
            ner0Var.dismiss();
        }
        this.e = null;
        androidx.appcompat.app.d dVar2 = this.f;
        if (dVar2 != null) {
            dVar2.hide();
        }
        this.f = null;
        dw20 dw20Var = this.h;
        if (dw20Var != null) {
            dw20Var.hide();
        }
        this.h = null;
        VkContextMenu vkContextMenu = this.g;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.g = null;
        androidx.appcompat.app.d dVar3 = this.i;
        if (dVar3 != null) {
            dVar3.hide();
        }
        this.i = null;
    }

    public final <T> void b(cwb0.m<T> mVar, final izs<? super T, s3q0> izsVar, gzs<s3q0> gzsVar) {
        List<T> list = mVar.m;
        List<jwb0<T>> list2 = mVar.l;
        a();
        cwb0.c1 c1Var = mVar.n;
        if (!(c1Var instanceof cwb0.c1.c)) {
            if (c1Var instanceof cwb0.c1.b) {
                g(mVar, izsVar, gzsVar, new c220(3));
                return;
            }
            if (!(c1Var instanceof cwb0.c1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((cwb0.c1.a) c1Var).getClass();
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (j5g.P(list, ((jwb0) t).f)) {
                    arrayList.add(t);
                }
            }
            krv0.l(R.attr.vk_ui_icon_accent);
            throw null;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (T t2 : list2) {
            if (j5g.P(list, ((jwb0) t2).f)) {
                arrayList2.add(t2);
            }
        }
        Context context = this.a;
        h7u0.a aVar = new h7u0.a(context);
        aVar.R(new a(context, arrayList2), new DialogInterface.OnClickListener() { // from class: xsna.azb0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                izsVar.invoke(((jwb0) arrayList2.get(i)).f);
            }
        });
        aVar.h0(mVar.a() != 0 ? context.getString(mVar.a()) : mVar.b);
        aVar.a0(new p43(gzsVar, 2));
        aVar.c = true;
        androidx.appcompat.app.d create = aVar.create();
        this.f = create;
        create.show();
    }

    public final void c(cwb0.s0 s0Var, gzs<s3q0> gzsVar) {
        a();
        x xVar = new x(this, s0Var, gzsVar, 2);
        jxb0 jxb0Var = this.c;
        jxb0Var.getClass();
        ((Handler) jxb0Var.b).postAtTime(xVar, j, SystemClock.uptimeMillis() + 250);
    }

    @ozl
    public final void f(ProfilesInfo profilesInfo, String str) {
        Context context = this.a;
        asb.a aVar = new asb.a(context);
        aVar.T0(profilesInfo);
        aVar.e = str;
        dw20 a2 = aVar.a();
        a2.Td(((AppCompatActivity) e3m.h(context)).getSupportFragmentManager(), "CurrentBottomSheet");
        this.h = a2;
    }

    public final czb0 g(cwb0.m mVar, izs izsVar, gzs gzsVar, izs izsVar2) {
        Iterable iterable = mVar.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (j5g.P(mVar.m, ((jwb0) obj).f)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            jwb0 jwb0Var = (jwb0) next;
            int i3 = jwb0Var.e;
            Drawable drawable = jwb0Var.c;
            int i4 = jwb0Var.b;
            CharSequence charSequence = jwb0Var.a;
            boolean z = jwb0Var.h;
            boolean z2 = jwb0Var.g;
            Integer num = jwb0Var.d;
            cpj0 cpj0Var = jwb0Var.i;
            arrayList2.add(new brj0(i, i3, drawable, i4, charSequence, z, z2, cpj0Var != null ? ItemType.CUSTOM : ItemType.DEFAULT, 0, num, null, cpj0Var, null, jwb0Var, 55808));
            i = i2;
        }
        apj0 apj0Var = new apj0(arrayList2, new mz80(7, this, izsVar));
        czb0 czb0Var = new czb0(apj0Var);
        Context context = this.a;
        dw20.b A0 = new dw20.b(context, null).i(apj0Var, true, true).a0(new e550(gzsVar, 11)).w0(mVar.a() != 0 ? context.getString(mVar.a()) : mVar.b).A0(mVar.e);
        Integer num2 = mVar.f;
        if (num2 != null) {
            A0.y0(num2.intValue());
        }
        dw20.b z0 = A0.z0(mVar.d);
        Integer num3 = mVar.g;
        z0.getClass();
        z0.d.Y = num3;
        dw20.b p0 = z0.B0(mVar.h).x0(mVar.i).v(mVar.j).p0(mVar.k);
        p0.getClass();
        p0.d.k1 = izsVar2;
        dw20 a2 = p0.a();
        this.h = a2;
        a2.Td(((AppCompatActivity) e3m.h(context)).getSupportFragmentManager(), "CurrentBottomSheet");
        return czb0Var;
    }

    @ozl
    public final void i(Context context, int i, int[] iArr, int i2, int i3, final izs<? super Integer, s3q0> izsVar) {
        a();
        if (iArr.length == 0) {
            return;
        }
        final RadioButtonGroupSettingsView radioButtonGroupSettingsView = new RadioButtonGroupSettingsView(context, null, 0, 14, 0);
        radioButtonGroupSettingsView.setOrientation(1);
        e3m.a aVar = e3m.a;
        radioButtonGroupSettingsView.setBackground(m33.a(R.drawable.highlight, context));
        float f = 8;
        f4m.y(iah0.a(f), radioButtonGroupSettingsView);
        f4m.x(iah0.a(f), radioButtonGroupSettingsView);
        f4m.w(iah0.a(f), radioButtonGroupSettingsView);
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            int i7 = i5 + 1;
            RadioButtonSettingsView radioButtonSettingsView = new RadioButtonSettingsView(context, null, 0, 14, 0);
            radioButtonSettingsView.setId(i5);
            radioButtonSettingsView.setChecked(i3 == i5);
            radioButtonSettingsView.setText(context.getString(i6));
            int a2 = iah0.a(12);
            radioButtonSettingsView.setPadding(a2, a2, a2, a2);
            radioButtonGroupSettingsView.addView(radioButtonSettingsView);
            i4++;
            i5 = i7;
        }
        h7u0.a aVar2 = new h7u0.a(context);
        aVar2.h0(context.getString(i));
        aVar2.f = radioButtonGroupSettingsView;
        aVar2.c = true;
        aVar2.c0(i2, new DialogInterface.OnClickListener() { // from class: xsna.pyb0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                izs izsVar2 = izs.this;
                if (izsVar2 != null) {
                    izsVar2.invoke(Integer.valueOf(radioButtonGroupSettingsView.getCheckedId()));
                }
            }
        });
        aVar2.W(R.string.cancel, null);
        this.i = aVar2.m();
    }

    public final void j(gzs<s3q0> gzsVar) {
        this.c.getClass();
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        Future<?> submit = asu0.q().submit(new ixb0(0, gzsVar));
        c(cwb0.j0.e, new rka0(submit, 3));
        k4 k4Var = new k4(15, submit, this);
        asu0Var.getClass();
        asu0.q().submit(new ixb0(0, k4Var));
    }
}
