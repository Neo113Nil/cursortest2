package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bmh0;
import defpackage.bwg;
import defpackage.ci8;
import defpackage.itv;
import defpackage.kgx;
import defpackage.pvg;
import defpackage.qoi0;
import defpackage.rqb1;
import defpackage.s9h0;
import defpackage.sls;
import defpackage.tls;
import defpackage.u1w;
import defpackage.wql;
import defpackage.wv5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/plus/core/debug/panel/internal/presentation/view/DebugPanelGeneralInfoView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Lu1w;", "insets", "Lkotlin/Function1;", "", "Lzy11;", "onAdditionalDataClicked", "Lkotlin/Function0;", "onLogsClicked", "onCloseButtonClicked", "<init>", "(Landroid/content/Context;Lu1w;Ltls;Lsls;Lsls;)V", "applyInsets", "(Lu1w;)V", "setupListeners", "()V", "setupRecyclerView", "value", "onInfoClicked", "(Ljava/lang/String;)V", "", "Lbwg;", "info", "updateInfo", "(Ljava/util/List;)V", "Lsls;", "Landroidx/recyclerview/widget/RecyclerView;", "infoRecyclerView$delegate", "Lwv5;", "getInfoRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "infoRecyclerView", "Landroid/widget/ImageButton;", "closeImageButton$delegate", "getCloseImageButton", "()Landroid/widget/ImageButton;", "closeImageButton", "Litv;", "infoAdapter", "Litv;", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugPanelGeneralInfoView extends LinearLayoutCompat {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("infoRecyclerView", 0, "getInfoRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", DebugPanelGeneralInfoView.class), b64.x(qoi0.a, DebugPanelGeneralInfoView.class, "closeImageButton", "getCloseImageButton()Landroid/widget/ImageButton;", 0)};

    /* renamed from: closeImageButton$delegate, reason: from kotlin metadata */
    private final wv5 closeImageButton;
    private final itv infoAdapter;

    /* renamed from: infoRecyclerView$delegate, reason: from kotlin metadata */
    private final wv5 infoRecyclerView;
    private final sls onCloseButtonClicked;

    public DebugPanelGeneralInfoView(Context context, u1w u1wVar, tls tlsVar, sls slsVar, sls slsVar2) {
        super(context);
        this.onCloseButtonClicked = slsVar2;
        this.infoRecyclerView = new wv5(new pvg(this, s9h0.plus_sdk_recycler_view_information, 0));
        this.closeImageButton = new wv5(new pvg(this, s9h0.plus_sdk_image_button_close, 1));
        this.infoAdapter = new itv(slsVar, new DebugPanelGeneralInfoView$infoAdapter$1(1, this, DebugPanelGeneralInfoView.class, "onInfoClicked", "onInfoClicked(Ljava/lang/String;)V", 0), tlsVar);
        LayoutInflater.from(context).inflate(bmh0.plus_debug_panel_information, (ViewGroup) this, true);
        applyInsets(u1wVar);
        setupListeners();
        setupRecyclerView();
    }

    private final void applyInsets(u1w insets) {
        setPadding(insets.a, insets.b, insets.c, getPaddingBottom());
        RecyclerView infoRecyclerView = getInfoRecyclerView();
        infoRecyclerView.setPadding(infoRecyclerView.getPaddingLeft(), infoRecyclerView.getPaddingTop(), infoRecyclerView.getPaddingRight(), insets.d);
    }

    private final ImageButton getCloseImageButton() {
        return (ImageButton) this.closeImageButton.a($$delegatedProperties[1]);
    }

    private final RecyclerView getInfoRecyclerView() {
        return (RecyclerView) this.infoRecyclerView.a($$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInfoClicked(String value) {
        rqb1.b(getContext(), value);
    }

    private final void setupListeners() {
        bb1.L(getCloseImageButton(), new ci8(24, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$0(DebugPanelGeneralInfoView debugPanelGeneralInfoView, View view) {
        debugPanelGeneralInfoView.onCloseButtonClicked.invoke();
    }

    private final void setupRecyclerView() {
        getInfoRecyclerView().setAdapter(this.infoAdapter);
        getInfoRecyclerView().addItemDecoration(new wql(getContext()));
    }

    public final void updateInfo(List<? extends bwg> info) {
        this.infoAdapter.submitList(info);
    }
}
