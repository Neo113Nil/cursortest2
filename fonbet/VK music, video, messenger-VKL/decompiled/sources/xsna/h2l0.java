package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.vk.dto.common.Source;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.stickers.StickerEntry;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StickerBarComponent.kt */
/* loaded from: classes2.dex */
public final class h2l0 extends j8i {
    public final ViewGroup i;
    public final mxv j;
    public final a1w k;
    public final com.vk.im.engine.models.c l;
    public final ChatFragment.l m;
    public final kcl0 n;
    public final i2l0 o;
    public final dk5 p;
    public Object q;

    public h2l0(ViewGroup viewGroup, mxv mxvVar, a1w a1wVar, com.vk.im.engine.models.c cVar, ChatFragment.l lVar, kcl0 kcl0Var) {
        i2l0 i2l0Var = new i2l0(viewGroup, kcl0Var);
        this.i = viewGroup;
        this.j = mxvVar;
        this.k = a1wVar;
        this.l = cVar;
        this.m = lVar;
        this.n = kcl0Var;
        this.o = i2l0Var;
        this.p = new dk5(kcl0Var);
        this.q = EmptyList.b;
        i2l0Var.g = new t50(1, this, h2l0.class, "onStickerClick", "onStickerClick(Lcom/vk/dto/stickers/StickerItem;)V", 0, 13);
    }

    @Override // xsna.j8i
    public final void N0() {
        ViewPropertyAnimator viewPropertyAnimator = this.o.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0147, code lost:
    
        if (r0.t1() == true) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(Dialog dialog) {
        int i;
        int i2;
        Boolean valueOf;
        ChatSettings Hb;
        boolean z = true;
        boolean z2 = (dialog.oc().a != WritePermission.State.ENABLED || (Hb = dialog.Hb()) == null || Hb.J) ? false : true;
        boolean Jc = dialog.Jc();
        boolean sc = dialog.sc();
        com.vk.im.ui.components.msg_list.a aVar = ChatFragment.this.H0;
        if (aVar == null) {
            aVar = null;
        }
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = aVar.O0.g().c;
        if (aVar.O0.j || list == null) {
            valueOf = null;
        } else if (list.isEmpty()) {
            valueOf = Boolean.TRUE;
        } else {
            List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list2 = list;
            boolean z3 = list2 instanceof Collection;
            if (z3 && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) it.next()).C0() && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (i == 1) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.a0(list);
                if (gVar != null && gVar.N0()) {
                    valueOf = Boolean.FALSE;
                }
            }
            if (z3 && list2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator<T> it2 = list2.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) it2.next()).m() && (i2 = i2 + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            valueOf = Boolean.valueOf(i2 == 0);
        }
        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
        imv imvVar = ChatFragment.this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        boolean z4 = imvVar.getText().length() == 0;
        this.j.getClass();
        this.j.getClass();
        boolean z5 = !sc && booleanValue;
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        boolean contains = a1wVar.r().Y.getValue().contains(dialog.Sb());
        if (!z2 || !z4 || Jc || !z5 || contains) {
            i2l0 i2l0Var = this.o;
            if (i2l0Var.h) {
                View view = i2l0Var.i;
                bwt0.p0(view != null ? view : null, false);
                return;
            }
            return;
        }
        final i750 i750Var = new i750(this, 27);
        ChatFragment chatFragment = ChatFragment.this;
        DialogExt dialogExt = chatFragment.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        Dialog Cb = dialogExt.Cb();
        if (Cb != null && Cb.zc()) {
            DialogExt dialogExt2 = chatFragment.V;
            if (dialogExt2 == null) {
                dialogExt2 = null;
            }
            Dialog Cb2 = dialogExt2.Cb();
            if (Cb2 != null) {
            }
        }
        z = false;
        StickersDictionaryItem a = this.p.a(this.i.getContext().getString(R.string.vkim_hello_suggest), null);
        if (a == null) {
            return;
        }
        final List O0 = j5g.O0(a.c);
        if (!z) {
            i750Var.invoke(O0);
            return;
        }
        a1w a1wVar2 = this.k;
        dfp dfpVar = new dfp(Source.CACHE);
        io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.g2l0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                List list3;
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ((List) obj).iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    list3 = O0;
                    if (!hasNext) {
                        break;
                    }
                    Object next = it3.next();
                    if (!list3.contains(((StickerEntry) next).c)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((StickerEntry) it4.next()).c);
                }
                i750.this.invoke(j5g.u0(arrayList2, list3));
                this.q = arrayList;
            }
        };
        int i3 = kwg0.a;
        I0(a1wVar2.E(this, dfpVar).subscribe(fVar, new hwg0()));
    }
}
