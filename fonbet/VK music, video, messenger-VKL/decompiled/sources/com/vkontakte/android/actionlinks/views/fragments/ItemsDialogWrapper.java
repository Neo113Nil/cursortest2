package com.vkontakte.android.actionlinks.views.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bhh;
import xsna.bpn0;
import xsna.dhr0;
import xsna.gz80;
import xsna.gzs;
import xsna.ml7;
import xsna.pu;
import xsna.s3q0;
import xsna.tk5;
import xsna.tlo0;
import xsna.tq;
import xsna.wr0;
import xsna.xng;
import xsna.xvx;

/* compiled from: ItemsDialogWrapper.kt */
/* loaded from: classes7.dex */
public final class ItemsDialogWrapper extends FragmentImpl {
    public static final /* synthetic */ int S = 0;
    public FragmentImpl N;
    public Integer O;
    public VkTopBar P;
    public pu Q;
    public final bpn0 R = new bpn0(new ml7(12));

    /* compiled from: ItemsDialogWrapper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            pu puVar = ((ItemsDialogWrapper) this.receiver).Q;
            if (puVar != null) {
                puVar.invoke();
            }
            return s3q0.a;
        }
    }

    public final void eo(boolean z) {
        ItemsDialogWrapper itemsDialogWrapper;
        a aVar;
        if (z) {
            itemsDialogWrapper = this;
            aVar = new a(0, itemsDialogWrapper, ItemsDialogWrapper.class, "onDone", "onDone()V", 0);
        } else {
            itemsDialogWrapper = this;
            aVar = null;
        }
        VkTopBar vkTopBar = itemsDialogWrapper.P;
        if (vkTopBar != null) {
            VkTopBar.a after = vkTopBar.getAfter();
            VkTopBar.a.c b = after != null ? after.b() : null;
            VkTopBar.a.c.f fVar = b instanceof VkTopBar.a.c.f ? (VkTopBar.a.c.f) b : null;
            if (fVar != null) {
                VkTopBar.a after2 = vkTopBar.getAfter();
                vkTopBar.setAfter(after2 != null ? after2.a(VkTopBar.a.c.f.a(fVar, null, null, aVar, b.a(null, new xvx(this, z), 3), 27)) : null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ItemsDialogWrapper itemsDialogWrapper;
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(dhr0.E()).inflate(R.layout.collection_items_dialog_wrapper_view, viewGroup, false);
        this.P = (VkTopBar) inflate.findViewById(R.id.cidwv_topbar);
        Integer num = this.O;
        VkTopBar vkTopBar = this.P;
        if (vkTopBar != null) {
            itemsDialogWrapper = this;
            vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.accessibility_toolbar_back), new xng(0, this, ItemsDialogWrapper.class, "dismiss", "dismiss()V", 0, 1), null, b.a(null, new bhh(itemsDialogWrapper, 29), 3), 4));
        } else {
            itemsDialogWrapper = this;
        }
        if (num != null) {
            int intValue = num.intValue();
            VkTopBar vkTopBar2 = itemsDialogWrapper.P;
            if (vkTopBar2 != null) {
                VkTopBar.Middle.Text.c cVar = null;
                Object[] objArr = 0 == true ? 1 : 0;
                vkTopBar2.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, intValue), null, null, null, null, 30), cVar, objArr, b.a(null, new wr0(27), 3), 6));
            }
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        super.onResume();
        if (gz80.a(23) && dhr0.L()) {
            if (gz80.a(26)) {
                Dialog dialog = this.s;
                if (dialog == null || (window2 = dialog.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
                    return;
                }
                decorView2.setSystemUiVisibility(8208);
                return;
            }
            Dialog dialog2 = this.s;
            if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.setSystemUiVisibility(8192);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentImpl fragmentImpl = this.N;
        if (fragmentImpl != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            androidx.fragment.app.a b = tk5.b(childFragmentManager, childFragmentManager);
            b.f(R.id.collection_items_dialog_wrapper_holder, fragmentImpl, null, 1);
            b.k(false);
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.FragmentDialogWrapper;
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        yn.setCanceledOnTouchOutside(false);
        if (bundle != null) {
            dismiss();
        }
        return yn;
    }
}
