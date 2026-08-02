package com.yandex.go.shortcuts.impl.advertisement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.shortcuts.dto.response.ShortcutInfoListItem;
import defpackage.bys;
import defpackage.cma1;
import defpackage.e3x;
import defpackage.ekh0;
import defpackage.i3y;
import defpackage.i8r0;
import defpackage.j3x;
import defpackage.jtv;
import defpackage.jzr0;
import defpackage.mj1;
import defpackage.mmp0;
import defpackage.ny61;
import defpackage.nzr0;
import defpackage.ppr0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u7h0;
import defpackage.wxs;
import defpackage.zxs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R#\u0010\u001c\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/shortcuts/impl/advertisement/ShortcutInfoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ljtv;", "Landroid/content/Context;", "context", "Ljzr0;", "shortcutInfo", "<init>", "(Landroid/content/Context;Ljzr0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljtv;", "Lzy11;", "onAttachedToWindow", "()V", "", "isArrowsPermanentlyHidden", "()Z", "Ljzr0;", "Lbys;", "", "adapter$delegate", "Li3y;", "getAdapter", "()Lbys;", "adapter", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShortcutInfoModalView extends SlideableBindingModalView<jtv> {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final jzr0 shortcutInfo;

    public ShortcutInfoModalView(Context context, jzr0 jzr0Var) {
        super(context);
        this.shortcutInfo = jzr0Var;
        this.adapter = a.b(LazyThreadSafetyMode.NONE, new ppr0(3, this, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bys adapter_delegate$lambda$0(ShortcutInfoModalView shortcutInfoModalView, Context context) {
        RecyclerView recyclerView = shortcutInfoModalView.getBinding().c;
        j3x j3xVar = new j3x();
        adapter_delegate$lambda$0$0(context, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        return bysVar;
    }

    private static final zy11 adapter_delegate$lambda$0$0(Context context, j3x j3xVar) {
        j3xVar.b = new LinearLayoutManager(context, 1, false);
        int i = ekh0.info_list_item;
        j3xVar.a.add(new zxs(nzr0.class, i, new mj1(new i8r0(20), new e3x(nzr0.class, j3xVar, i), 5)));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter_delegate$lambda$0$0$0(View view, nzr0 nzr0Var) {
        ListItemComponent listItemComponent = (ListItemComponent) view;
        listItemComponent.setTitle(nzr0Var.a);
        listItemComponent.setSubtitle(nzr0Var.b);
        listItemComponent.setTitleSingleLine(true);
        listItemComponent.setTitleEllipsizeMode(1);
        listItemComponent.setSubtitleMaxLines(3);
        listItemComponent.setMinHeight(tje.u(32, listItemComponent.getContext()));
        listItemComponent.setDividers(DividerPosition.BOTTOM, nzr0Var.c);
        return zy11.a;
    }

    private final bys getAdapter() {
        return (bys) this.adapter.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public jtv bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ekh0.info_list, parent, false);
        int i = u7h0.close_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = u7h0.info_list;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                return new jtv((LinearLayout) inflate, buttonComponent, recyclerView);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bys adapter = getAdapter();
        List list = this.shortcutInfo.a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ShortcutInfoListItem shortcutInfoListItem = (ShortcutInfoListItem) obj;
            arrayList.add(new nzr0(shortcutInfoListItem.a, shortcutInfoListItem.b, i == scc.f(list) ? DividerType.NONE : DividerType.MARGIN));
            i = i2;
        }
        adapter.submitList(arrayList, null);
        getBinding().b.setDebounceClickListener(new mmp0(17, this));
    }
}
