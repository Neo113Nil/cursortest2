package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.core.view.tools.VkViewStub;
import kotlin.NoWhenBranchMatchedException;
import xsna.lw;
import xsna.uu;
import xsna.wf00;

/* compiled from: ActionButtonRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class bv {
    public final VkViewStub a;
    public final jlh0 b;
    public final mw c;
    public lw d;
    public lw.d e;

    public bv(VkViewStub vkViewStub, jlh0 jlh0Var, wf00 wf00Var, mw mwVar) {
        this.a = vkViewStub;
        this.b = jlh0Var;
        this.c = mwVar;
    }

    public final ClipActionButton a() {
        VkViewStub vkViewStub = this.a;
        if (!vkViewStub.c) {
            vkViewStub.a();
        }
        View view = vkViewStub.getView();
        if (view instanceof ClipActionButton) {
            return (ClipActionButton) view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(lw lwVar, boolean z) {
        ClipActionButton a;
        Context context;
        ClipActionButton.a aVar;
        ClipActionButton a2;
        ClipActionButton a3;
        lw.c cVar;
        ClipActionButton a4;
        Context context2;
        Drawable drawable;
        CharSequence append;
        ClipActionButton a5;
        lw lwVar2 = this.d;
        if ((lwVar2 == null && !this.a.c && (lwVar instanceof lw.b)) || lwVar.equals(lwVar2)) {
            return;
        }
        boolean z2 = lwVar instanceof lw.d;
        ClipActionButton a6 = a();
        if (a6 != null) {
            awt0.v(a6, z2);
        }
        this.c.a(z2);
        if (z2) {
            lw.d dVar = (lw.d) lwVar;
            lw.a aVar2 = dVar.b;
            if (!dVar.equals(this.e) && (a = a()) != null && (context = a.getContext()) != null) {
                int b = aVar2.b.b(context);
                int b2 = aVar2.a.b(context);
                lw.d dVar2 = this.e;
                if (dVar2 != null) {
                    if (!z) {
                        dVar2 = null;
                    }
                    if (dVar2 != null) {
                        lw.a aVar3 = dVar2.b;
                        aVar = new ClipActionButton.a(new ClipActionButton.a.InterfaceC0571a.C0572a(aVar3.b.b(context), b), new ClipActionButton.a.InterfaceC0571a.C0572a(aVar3.a.b(context), b2));
                        a2 = a();
                        if (a2 != null) {
                            a2.setSize(dVar.c);
                        }
                        a3 = a();
                        if (a3 != null) {
                            a3.setAppearance(aVar);
                        }
                        cVar = dVar.a;
                        a4 = a();
                        if (a4 != null && (context2 = a4.getContext()) != null) {
                            if (!(cVar instanceof lw.c.C3304c)) {
                                lw.c.C3304c c3304c = (lw.c.C3304c) cVar;
                                append = this.b.b(context2, c3304c.a, c3304c.b, c3304c.c);
                            } else if (cVar instanceof lw.c.a) {
                                append = ((lw.c.a) cVar).a.a(context2);
                            } else {
                                if (!(cVar instanceof lw.c.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                lw.c.b bVar = (lw.c.b) cVar;
                                uu uuVar = bVar.b;
                                String str = bVar.a;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                if (uuVar instanceof uu.a) {
                                    float f = 24;
                                    drawable = new baf0(new BitmapDrawable(context2.getResources(), Bitmap.createScaledBitmap(((uu.a) uuVar).a, iah0.a(f), iah0.a(f), true)), b);
                                } else {
                                    if (!(uuVar instanceof uu.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    uu.b bVar2 = (uu.b) uuVar;
                                    drawable = context2.getDrawable(bVar2.a);
                                    if (drawable != null) {
                                        float f2 = 24;
                                        drawable.setBounds(0, 0, iah0.a(f2), iah0.a(f2));
                                        Integer num = bVar2.b;
                                        if (num != null) {
                                            b = e3m.f(num.intValue(), context2);
                                        }
                                        drawable.setTint(b);
                                    }
                                    append = spannableStringBuilder.append(" ", new wf00.a(iah0.a(8)), 33).append((CharSequence) str);
                                }
                                spannableStringBuilder = spannableStringBuilder.append(" ", new dqa(drawable), 33);
                                append = spannableStringBuilder.append(" ", new wf00.a(iah0.a(8)), 33).append((CharSequence) str);
                            }
                            a5 = a();
                            if (a5 != null) {
                                a5.setText(append);
                            }
                        }
                    }
                }
                aVar = new ClipActionButton.a(new ClipActionButton.a.InterfaceC0571a.b(b), new ClipActionButton.a.InterfaceC0571a.b(b2));
                a2 = a();
                if (a2 != null) {
                }
                a3 = a();
                if (a3 != null) {
                }
                cVar = dVar.a;
                a4 = a();
                if (a4 != null) {
                    if (!(cVar instanceof lw.c.C3304c)) {
                    }
                    a5 = a();
                    if (a5 != null) {
                    }
                }
            }
            s3q0 s3q0Var = s3q0.a;
            this.e = dVar;
        }
        this.d = lwVar;
    }
}
