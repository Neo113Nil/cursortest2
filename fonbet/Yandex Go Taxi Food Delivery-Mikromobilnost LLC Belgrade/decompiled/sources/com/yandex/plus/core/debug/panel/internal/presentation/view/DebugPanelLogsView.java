package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.plus.core.debug.panel.internal.data.PlusSdkFileProvider;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView;
import com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b;
import com.yandex.plus.core.debug.panel.internal.utils.ext.EditTextExtKt$debouncedAfterTextChanged$1;
import defpackage.afj;
import defpackage.apf;
import defpackage.awg;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bfj;
import defpackage.bmh0;
import defpackage.cez;
import defpackage.cfj;
import defpackage.ci8;
import defpackage.dej;
import defpackage.dke;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.flz;
import defpackage.gxg0;
import defpackage.hxq;
import defpackage.i3y;
import defpackage.iez;
import defpackage.ii8;
import defpackage.j73;
import defpackage.jqr;
import defpackage.jzj;
import defpackage.kez;
import defpackage.kgx;
import defpackage.mvh0;
import defpackage.qoi0;
import defpackage.rqb1;
import defpackage.s9h0;
import defpackage.scc;
import defpackage.sls;
import defpackage.syc;
import defpackage.tbb;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tse;
import defpackage.tvg;
import defpackage.u1w;
import defpackage.ukz;
import defpackage.uvg;
import defpackage.uza;
import defpackage.w511;
import defpackage.wql;
import defpackage.wv5;
import defpackage.wvg;
import defpackage.ycc;
import defpackage.yvg;
import defpackage.yw01;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 t2\u00020\u0001:\u0001uBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b!\u0010 JE\u0010%\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001c\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010\u0013J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u001bJ\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0013J\u000f\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u0013J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010KR\u001b\u0010O\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\bN\u0010KR\u001b\u0010R\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bQ\u0010FR\u001b\u0010U\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010?\u001a\u0004\bT\u0010FR\u001b\u0010Y\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010?\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010?\u001a\u0004\b\\\u0010]R\u001b\u0010a\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010?\u001a\u0004\b`\u0010FR\u001b\u0010d\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010?\u001a\u0004\bc\u0010FR\u001b\u0010g\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010?\u001a\u0004\bf\u0010FR\u001b\u0010j\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010?\u001a\u0004\bi\u0010XR\u001b\u0010m\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010?\u001a\u0004\bl\u0010FR\u0016\u0010o\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s¨\u0006v"}, d2 = {"Lcom/yandex/plus/core/debug/panel/internal/presentation/view/DebugPanelLogsView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Ldej;", "dialogHost", "Ltse;", "viewModelScope", "Lcom/yandex/plus/core/debug/panel/internal/presentation/viewModel/b;", "viewModel", "Lu1w;", "insets", "Lkotlin/Function1;", "", "Lzy11;", "onBackClicked", "<init>", "(Landroid/content/Context;Ldej;Ltse;Lcom/yandex/plus/core/debug/panel/internal/presentation/viewModel/b;Lu1w;Ltls;)V", "onDetachedFromWindow", "()V", "observe", "applyInsets", "(Lu1w;)V", "setupRecyclerView", "setupListeners", "isVisible", "changeHeaderVisibility", "(Z)V", "", "Lcez;", "items", "showLevelFilterDialog", "(Ljava/util/List;)V", "showFieldsDialog", "onConfirm", "Lkotlin/Function0;", "onReset", "showDialog", "(Ljava/util/List;Ltls;Lsls;)V", "Lcfj;", "dialogState", "handleDialogState", "(Lcfj;)V", "setupScrollButton", "", "value", "onItemClicked", "(Ljava/lang/String;)V", "isEnabled", "updateMatchButtonsState", "clearSearchQuery", "hideKeyboard", "Landroid/view/View;", "view", "showKeyboard", "(Landroid/view/View;)V", "Ldej;", "Ltse;", "Lcom/yandex/plus/core/debug/panel/internal/presentation/viewModel/b;", "Lu1w;", "Ltls;", "Landroidx/recyclerview/widget/RecyclerView;", "logsRecyclerView$delegate", "Lwv5;", "getLogsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "logsRecyclerView", "Landroid/widget/ImageButton;", "backToInfoImageButton$delegate", "getBackToInfoImageButton", "()Landroid/widget/ImageButton;", "backToInfoImageButton", "Landroid/widget/TextView;", "backToInfoTextView$delegate", "getBackToInfoTextView", "()Landroid/widget/TextView;", "backToInfoTextView", "titleLogsTextView$delegate", "getTitleLogsTextView", "titleLogsTextView", "menuImageButton$delegate", "getMenuImageButton", "menuImageButton", "toSearchImageButton$delegate", "getToSearchImageButton", "toSearchImageButton", "searchView$delegate", "getSearchView", "()Landroid/view/View;", "searchView", "Landroid/widget/EditText;", "searchEditText$delegate", "getSearchEditText", "()Landroid/widget/EditText;", "searchEditText", "previousMatchImageButton$delegate", "getPreviousMatchImageButton", "previousMatchImageButton", "nextMatchImageButton$delegate", "getNextMatchImageButton", "nextMatchImageButton", "searchClearImageButton$delegate", "getSearchClearImageButton", "searchClearImageButton", "closeSearchImageButton$delegate", "getCloseSearchImageButton", "closeSearchImageButton", "scrollImageButton$delegate", "getScrollImageButton", "scrollImageButton", "", "iconSrc", CA20Status.STATUS_USER_I, "Lukz;", "logsAdapter", "Lukz;", "Companion", "yvg", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugPanelLogsView extends LinearLayoutCompat {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("logsRecyclerView", 0, "getLogsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", DebugPanelLogsView.class), b64.x(qoi0.a, DebugPanelLogsView.class, "backToInfoImageButton", "getBackToInfoImageButton()Landroid/widget/ImageButton;", 0), new PropertyReference1Impl("backToInfoTextView", 0, "getBackToInfoTextView()Landroid/widget/TextView;", DebugPanelLogsView.class), new PropertyReference1Impl("titleLogsTextView", 0, "getTitleLogsTextView()Landroid/widget/TextView;", DebugPanelLogsView.class), new PropertyReference1Impl("menuImageButton", 0, "getMenuImageButton()Landroid/widget/ImageButton;", DebugPanelLogsView.class), new PropertyReference1Impl("toSearchImageButton", 0, "getToSearchImageButton()Landroid/widget/ImageButton;", DebugPanelLogsView.class), new PropertyReference1Impl("searchView", 0, "getSearchView()Landroid/view/View;", DebugPanelLogsView.class), new PropertyReference1Impl("searchEditText", 0, "getSearchEditText()Landroid/widget/EditText;", DebugPanelLogsView.class), new PropertyReference1Impl("previousMatchImageButton", 0, "getPreviousMatchImageButton()Landroid/widget/ImageButton;", DebugPanelLogsView.class), new PropertyReference1Impl("nextMatchImageButton", 0, "getNextMatchImageButton()Landroid/widget/ImageButton;", DebugPanelLogsView.class), new PropertyReference1Impl("searchClearImageButton", 0, "getSearchClearImageButton()Landroid/widget/ImageButton;", DebugPanelLogsView.class), new PropertyReference1Impl("closeSearchImageButton", 0, "getCloseSearchImageButton()Landroid/view/View;", DebugPanelLogsView.class), new PropertyReference1Impl("scrollImageButton", 0, "getScrollImageButton()Landroid/widget/ImageButton;", DebugPanelLogsView.class)};
    private static final yvg Companion = new yvg();

    @Deprecated
    public static final long DELAY_BUTTON_ANIMATION_TIME = 500;

    @Deprecated
    public static final float DISABLED_ALPHA = 0.5f;

    @Deprecated
    public static final long DURATION_BUTTON_ANIMATION_TIME = 300;

    @Deprecated
    public static final float ENABLED_ALPHA = 1.0f;

    /* renamed from: backToInfoImageButton$delegate, reason: from kotlin metadata */
    private final wv5 backToInfoImageButton;

    /* renamed from: backToInfoTextView$delegate, reason: from kotlin metadata */
    private final wv5 backToInfoTextView;

    /* renamed from: closeSearchImageButton$delegate, reason: from kotlin metadata */
    private final wv5 closeSearchImageButton;
    private final dej dialogHost;
    private int iconSrc;
    private final u1w insets;
    private final ukz logsAdapter;

    /* renamed from: logsRecyclerView$delegate, reason: from kotlin metadata */
    private final wv5 logsRecyclerView;

    /* renamed from: menuImageButton$delegate, reason: from kotlin metadata */
    private final wv5 menuImageButton;

    /* renamed from: nextMatchImageButton$delegate, reason: from kotlin metadata */
    private final wv5 nextMatchImageButton;
    private final tls onBackClicked;

    /* renamed from: previousMatchImageButton$delegate, reason: from kotlin metadata */
    private final wv5 previousMatchImageButton;

    /* renamed from: scrollImageButton$delegate, reason: from kotlin metadata */
    private final wv5 scrollImageButton;

    /* renamed from: searchClearImageButton$delegate, reason: from kotlin metadata */
    private final wv5 searchClearImageButton;

    /* renamed from: searchEditText$delegate, reason: from kotlin metadata */
    private final wv5 searchEditText;

    /* renamed from: searchView$delegate, reason: from kotlin metadata */
    private final wv5 searchView;

    /* renamed from: titleLogsTextView$delegate, reason: from kotlin metadata */
    private final wv5 titleLogsTextView;

    /* renamed from: toSearchImageButton$delegate, reason: from kotlin metadata */
    private final wv5 toSearchImageButton;
    private final b viewModel;
    private final tse viewModelScope;

    public DebugPanelLogsView(Context context, dej dejVar, tse tseVar, b bVar, u1w u1wVar, tls tlsVar) {
        super(context);
        this.dialogHost = dejVar;
        this.viewModelScope = tseVar;
        this.viewModel = bVar;
        this.insets = u1wVar;
        this.onBackClicked = tlsVar;
        this.logsRecyclerView = new wv5(new awg(this, s9h0.plus_sdk_recycler_view_logs, 4));
        this.backToInfoImageButton = new wv5(new awg(this, s9h0.plus_sdk_image_button_back_to_info, 5));
        this.backToInfoTextView = new wv5(new awg(this, s9h0.plus_sdk_text_view_back, 6));
        this.titleLogsTextView = new wv5(new awg(this, s9h0.plus_sdk_text_view_title_logs, 7));
        this.menuImageButton = new wv5(new awg(this, s9h0.plus_sdk_image_button_menu, 8));
        this.toSearchImageButton = new wv5(new awg(this, s9h0.plus_sdk_image_button_to_search, 9));
        this.searchView = new wv5(new awg(this, s9h0.plus_sdk_view_search_header, 10));
        this.searchEditText = new wv5(new awg(this, s9h0.plus_sdk_et_search, 11));
        this.previousMatchImageButton = new wv5(new awg(this, s9h0.plus_sdk_btn_search_prev, 12));
        this.nextMatchImageButton = new wv5(new awg(this, s9h0.plus_sdk_btn_search_next, 0));
        this.searchClearImageButton = new wv5(new awg(this, s9h0.plus_sdk_btn_search_clear, 1));
        this.closeSearchImageButton = new wv5(new awg(this, s9h0.plus_sdk_image_button_close_search, 2));
        this.scrollImageButton = new wv5(new awg(this, s9h0.plus_sdk_button_scroll, 3));
        this.iconSrc = gxg0.plus_debug_panel_ic_arrow_down;
        this.logsAdapter = new ukz(new DebugPanelLogsView$logsAdapter$1(1, this, DebugPanelLogsView.class, "onItemClicked", "onItemClicked(Ljava/lang/String;)V", 0));
        LayoutInflater.from(context).inflate(bmh0.plus_debug_panel_logs, (ViewGroup) this, true);
        applyInsets(u1wVar);
        observe();
        setupRecyclerView();
        setupScrollButton();
        updateMatchButtonsState(false);
        setupListeners();
    }

    private final void applyInsets(u1w insets) {
        int i = insets.b;
        int i2 = insets.a;
        setPadding(i2, i, insets.c, getPaddingBottom());
        RecyclerView logsRecyclerView = getLogsRecyclerView();
        int i3 = insets.d;
        logsRecyclerView.setPadding(logsRecyclerView.getPaddingLeft(), logsRecyclerView.getPaddingTop(), logsRecyclerView.getPaddingRight(), i3);
        bb1.S(i2, i3, 6, getScrollImageButton());
    }

    private final void changeHeaderVisibility(boolean isVisible) {
        getBackToInfoImageButton().setVisibility(isVisible ? 0 : 8);
        getBackToInfoTextView().setVisibility(isVisible ? 0 : 8);
        getTitleLogsTextView().setVisibility(isVisible ? 0 : 8);
        getToSearchImageButton().setVisibility(isVisible ? 0 : 8);
        getMenuImageButton().setVisibility(isVisible ? 0 : 8);
        getSearchView().setVisibility(isVisible ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSearchQuery() {
        this.viewModel.c();
        getSearchEditText().setText("");
    }

    private final ImageButton getBackToInfoImageButton() {
        return (ImageButton) this.backToInfoImageButton.a($$delegatedProperties[1]);
    }

    private final TextView getBackToInfoTextView() {
        return (TextView) this.backToInfoTextView.a($$delegatedProperties[2]);
    }

    private final View getCloseSearchImageButton() {
        return (View) this.closeSearchImageButton.a($$delegatedProperties[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getLogsRecyclerView() {
        return (RecyclerView) this.logsRecyclerView.a($$delegatedProperties[0]);
    }

    private final ImageButton getMenuImageButton() {
        return (ImageButton) this.menuImageButton.a($$delegatedProperties[4]);
    }

    private final ImageButton getNextMatchImageButton() {
        return (ImageButton) this.nextMatchImageButton.a($$delegatedProperties[9]);
    }

    private final ImageButton getPreviousMatchImageButton() {
        return (ImageButton) this.previousMatchImageButton.a($$delegatedProperties[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageButton getScrollImageButton() {
        return (ImageButton) this.scrollImageButton.a($$delegatedProperties[12]);
    }

    private final ImageButton getSearchClearImageButton() {
        return (ImageButton) this.searchClearImageButton.a($$delegatedProperties[10]);
    }

    private final EditText getSearchEditText() {
        return (EditText) this.searchEditText.a($$delegatedProperties[7]);
    }

    private final View getSearchView() {
        return (View) this.searchView.a($$delegatedProperties[6]);
    }

    private final TextView getTitleLogsTextView() {
        return (TextView) this.titleLogsTextView.a($$delegatedProperties[3]);
    }

    private final ImageButton getToSearchImageButton() {
        return (ImageButton) this.toSearchImageButton.a($$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDialogState(cfj dialogState) {
        if (dialogState instanceof bfj) {
            showLevelFilterDialog(((bfj) dialogState).a);
        } else if (dialogState instanceof afj) {
            showFieldsDialog(((afj) dialogState).a);
        } else {
            if (dialogState == null) {
                return;
            }
            w511.b();
        }
    }

    private final void hideKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getSearchEditText().getWindowToken(), 0);
        }
    }

    private final void observe() {
        int i = 3;
        e.H(this.viewModelScope, new jqr(e.t(new syc(this.viewModel.q, 6)), new DebugPanelLogsView$observe$2(this, null), i));
        e.H(this.viewModelScope, new jqr(this.viewModel.q, new DebugPanelLogsView$observe$3(this, null), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClicked(String value) {
        rqb1.b(getContext(), value);
    }

    private final void setupListeners() {
        PopupMenu popupMenu = new PopupMenu(getContext(), getMenuImageButton());
        popupMenu.getMenuInflater().inflate(mvh0.plus_debug_panel_menu_logs, popupMenu.getMenu());
        final int i = 6;
        bb1.L(getBackToInfoImageButton(), new View.OnClickListener(this) { // from class: vvg
            public final /* synthetic */ DebugPanelLogsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DebugPanelLogsView debugPanelLogsView = this.b;
                switch (i2) {
                    case 0:
                        DebugPanelLogsView.setupListeners$lambda$2(debugPanelLogsView, view);
                        break;
                    case 1:
                        DebugPanelLogsView.setupListeners$lambda$4(debugPanelLogsView, view);
                        break;
                    case 2:
                        DebugPanelLogsView.setupListeners$lambda$5(debugPanelLogsView, view);
                        break;
                    case 3:
                        DebugPanelLogsView.setupListeners$lambda$6(debugPanelLogsView, view);
                        break;
                    case 4:
                        DebugPanelLogsView.setupListeners$lambda$9(debugPanelLogsView, view);
                        break;
                    case 5:
                        DebugPanelLogsView.setupListeners$lambda$10(debugPanelLogsView, view);
                        break;
                    case 6:
                        DebugPanelLogsView.setupListeners$lambda$1(debugPanelLogsView, view);
                        break;
                    default:
                        debugPanelLogsView.clearSearchQuery();
                        break;
                }
            }
        });
        final int i2 = 0;
        bb1.L(getBackToInfoTextView(), new View.OnClickListener(this) { // from class: vvg
            public final /* synthetic */ DebugPanelLogsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                DebugPanelLogsView debugPanelLogsView = this.b;
                switch (i22) {
                    case 0:
                        DebugPanelLogsView.setupListeners$lambda$2(debugPanelLogsView, view);
                        break;
                    case 1:
                        DebugPanelLogsView.setupListeners$lambda$4(debugPanelLogsView, view);
                        break;
                    case 2:
                        DebugPanelLogsView.setupListeners$lambda$5(debugPanelLogsView, view);
                        break;
                    case 3:
                        DebugPanelLogsView.setupListeners$lambda$6(debugPanelLogsView, view);
                        break;
                    case 4:
                        DebugPanelLogsView.setupListeners$lambda$9(debugPanelLogsView, view);
                        break;
                    case 5:
                        DebugPanelLogsView.setupListeners$lambda$10(debugPanelLogsView, view);
                        break;
                    case 6:
                        DebugPanelLogsView.setupListeners$lambda$1(debugPanelLogsView, view);
                        break;
                    default:
                        debugPanelLogsView.clearSearchQuery();
                        break;
                }
            }
        });
        bb1.L(getMenuImageButton(), new ci8(25, popupMenu));
        final int i3 = 1;
        bb1.L(getToSearchImageButton(), new View.OnClickListener(this) { // from class: vvg
            public final /* synthetic */ DebugPanelLogsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                DebugPanelLogsView debugPanelLogsView = this.b;
                switch (i22) {
                    case 0:
                        DebugPanelLogsView.setupListeners$lambda$2(debugPanelLogsView, view);
                        break;
                    case 1:
                        DebugPanelLogsView.setupListeners$lambda$4(debugPanelLogsView, view);
                        break;
                    case 2:
                        DebugPanelLogsView.setupListeners$lambda$5(debugPanelLogsView, view);
                        break;
                    case 3:
                        DebugPanelLogsView.setupListeners$lambda$6(debugPanelLogsView, view);
                        break;
                    case 4:
                        DebugPanelLogsView.setupListeners$lambda$9(debugPanelLogsView, view);
                        break;
                    case 5:
                        DebugPanelLogsView.setupListeners$lambda$10(debugPanelLogsView, view);
                        break;
                    case 6:
                        DebugPanelLogsView.setupListeners$lambda$1(debugPanelLogsView, view);
                        break;
                    default:
                        debugPanelLogsView.clearSearchQuery();
                        break;
                }
            }
        });
        final int i4 = 2;
        bb1.L(getCloseSearchImageButton(), new View.OnClickListener(this) { // from class: vvg
            public final /* synthetic */ DebugPanelLogsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i4;
                DebugPanelLogsView debugPanelLogsView = this.b;
                switch (i22) {
                    case 0:
                        DebugPanelLogsView.setupListeners$lambda$2(debugPanelLogsView, view);
                        break;
                    case 1:
                        DebugPanelLogsView.setupListeners$lambda$4(debugPanelLogsView, view);
                        break;
                    case 2:
                        DebugPanelLogsView.setupListeners$lambda$5(debugPanelLogsView, view);
                        break;
                    case 3:
                        DebugPanelLogsView.setupListeners$lambda$6(debugPanelLogsView, view);
                        break;
                    case 4:
                        DebugPanelLogsView.setupListeners$lambda$9(debugPanelLogsView, view);
                        break;
                    case 5:
                        DebugPanelLogsView.setupListeners$lambda$10(debugPanelLogsView, view);
                        break;
                    case 6:
                        DebugPanelLogsView.setupListeners$lambda$1(debugPanelLogsView, view);
                        break;
                    default:
                        debugPanelLogsView.clearSearchQuery();
                        break;
                }
            }
        });
        final int i5 = 3;
        bb1.L(getScrollImageButton(), new View.OnClickListener(this) { // from class: vvg
            public final /* synthetic */ DebugPanelLogsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i5;
                DebugPanelLogsView debugPanelLogsView = this.b;
                switch (i22) {
                    case 0:
                        DebugPanelLogsView.setupListeners$lambda$2(debugPanelLogsView, view);
                        break;
                    case 1:
                        DebugPanelLogsView.setupListeners$lambda$4(debugPanelLogsView, view);
                        break;
                    case 2:
                        DebugPanelLogsView.setupListeners$lambda$5(debugPanelLogsView, view);
                        break;
                    case 3:
                        DebugPanelLogsView.setupListeners$lambda$6(debugPanelLogsView, view);
                        break;
                    case 4:
                        DebugPanelLogsView.setupListeners$lambda$9(debugPanelLogsView, view);
                        break;
                    case 5:
                        DebugPanelLogsView.setupListeners$lambda$10(debugPanelLogsView, view);
                        break;
                    case 6:
                        DebugPanelLogsView.setupListeners$lambda$1(debugPanelLogsView, view);
                        break;
                    default:
                        debugPanelLogsView.clearSearchQuery();
                        break;
                }
            }
        });
        EditText searchEditText = getSearchEditText();
        searchEditText.addTextChangedListener(new EditTextExtKt$debouncedAfterTextChanged$1(searchEditText, 400L, new uvg(this, i3)));
        getSearchEditText().setOnEditorActionListener(new ff2(11, this));
        final int i6 = 4;
        bb1.L(getNextMatchImageButton(), new View.OnClickListener(this) { // from class: vvg
            public final /* synthetic */ DebugPanelLogsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i6;
                DebugPanelLogsView debugPanelLogsView = this.b;
                switch (i22) {
                    case 0:
                        DebugPanelLogsView.setupListeners$lambda$2(debugPanelLogsView, view);
                        break;
                    case 1:
                        DebugPanelLogsView.setupListeners$lambda$4(debugPanelLogsView, view);
                        break;
                    case 2:
                        DebugPanelLogsView.setupListeners$lambda$5(debugPanelLogsView, view);
                        break;
                    case 3:
                        DebugPanelLogsView.setupListeners$lambda$6(debugPanelLogsView, view);
                        break;
                    case 4:
                        DebugPanelLogsView.setupListeners$lambda$9(debugPanelLogsView, view);
                        break;
                    case 5:
                        DebugPanelLogsView.setupListeners$lambda$10(debugPanelLogsView, view);
                        break;
                    case 6:
                        DebugPanelLogsView.setupListeners$lambda$1(debugPanelLogsView, view);
                        break;
                    default:
                        debugPanelLogsView.clearSearchQuery();
                        break;
                }
            }
        });
        final int i7 = 5;
        bb1.L(getPreviousMatchImageButton(), new View.OnClickListener(this) { // from class: vvg
            public final /* synthetic */ DebugPanelLogsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i7;
                DebugPanelLogsView debugPanelLogsView = this.b;
                switch (i22) {
                    case 0:
                        DebugPanelLogsView.setupListeners$lambda$2(debugPanelLogsView, view);
                        break;
                    case 1:
                        DebugPanelLogsView.setupListeners$lambda$4(debugPanelLogsView, view);
                        break;
                    case 2:
                        DebugPanelLogsView.setupListeners$lambda$5(debugPanelLogsView, view);
                        break;
                    case 3:
                        DebugPanelLogsView.setupListeners$lambda$6(debugPanelLogsView, view);
                        break;
                    case 4:
                        DebugPanelLogsView.setupListeners$lambda$9(debugPanelLogsView, view);
                        break;
                    case 5:
                        DebugPanelLogsView.setupListeners$lambda$10(debugPanelLogsView, view);
                        break;
                    case 6:
                        DebugPanelLogsView.setupListeners$lambda$1(debugPanelLogsView, view);
                        break;
                    default:
                        debugPanelLogsView.clearSearchQuery();
                        break;
                }
            }
        });
        final int i8 = 7;
        bb1.L(getSearchClearImageButton(), new View.OnClickListener(this) { // from class: vvg
            public final /* synthetic */ DebugPanelLogsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i8;
                DebugPanelLogsView debugPanelLogsView = this.b;
                switch (i22) {
                    case 0:
                        DebugPanelLogsView.setupListeners$lambda$2(debugPanelLogsView, view);
                        break;
                    case 1:
                        DebugPanelLogsView.setupListeners$lambda$4(debugPanelLogsView, view);
                        break;
                    case 2:
                        DebugPanelLogsView.setupListeners$lambda$5(debugPanelLogsView, view);
                        break;
                    case 3:
                        DebugPanelLogsView.setupListeners$lambda$6(debugPanelLogsView, view);
                        break;
                    case 4:
                        DebugPanelLogsView.setupListeners$lambda$9(debugPanelLogsView, view);
                        break;
                    case 5:
                        DebugPanelLogsView.setupListeners$lambda$10(debugPanelLogsView, view);
                        break;
                    case 6:
                        DebugPanelLogsView.setupListeners$lambda$1(debugPanelLogsView, view);
                        break;
                    default:
                        debugPanelLogsView.clearSearchQuery();
                        break;
                }
            }
        });
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: xvg
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean z;
                z = DebugPanelLogsView.setupListeners$lambda$12(DebugPanelLogsView.this, menuItem);
                return z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$1(DebugPanelLogsView debugPanelLogsView, View view) {
        debugPanelLogsView.onBackClicked.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$10(DebugPanelLogsView debugPanelLogsView, View view) {
        b bVar = debugPanelLogsView.viewModel;
        bVar.d(((bVar.m + r2) - 1) % ((List) bVar.j.getValue()).size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean setupListeners$lambda$12(DebugPanelLogsView debugPanelLogsView, MenuItem menuItem) {
        Result.Failure failure;
        Object failure2;
        int itemId = menuItem.getItemId();
        if (itemId == s9h0.plus_sdk_menu_fields) {
            b bVar = debugPanelLogsView.viewModel;
            r0 r0Var = bVar.p;
            afj afjVar = new afj((List) bVar.o.getValue());
            r0Var.getClass();
            r0Var.m(null, afjVar);
            return true;
        }
        if (itemId == s9h0.plus_sdk_menu_levels) {
            b bVar2 = debugPanelLogsView.viewModel;
            r0 r0Var2 = bVar2.p;
            bfj bfjVar = new bfj((List) bVar2.n.getValue());
            r0Var2.getClass();
            r0Var2.m(null, bfjVar);
            return true;
        }
        int i = 0;
        if (itemId != s9h0.plus_sdk_menu_send) {
            if (itemId != s9h0.plus_sdk_menu_clear) {
                return false;
            }
            b bVar3 = debugPanelLogsView.viewModel;
            bVar3.g.invoke();
            bVar3.c();
            return true;
        }
        b bVar4 = debugPanelLogsView.viewModel;
        tvg tvgVar = bVar4.f;
        kez kezVar = bVar4.c;
        List list = (List) bVar4.i.getValue();
        kezVar.getClass();
        String X = kotlin.collections.a.X(list, "\n\n\n", null, null, new iez(i), 30);
        apf apfVar = (apf) tvgVar;
        Context context = (Context) apfVar.b;
        String format = String.format((String) apfVar.c, Arrays.copyOf(new Object[]{((SimpleDateFormat) ((i3y) apfVar.w).getValue()).format(new Date())}, 1));
        try {
            File file = new File((File) apfVar.x, format);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(X.getBytes(uza.a));
                fileOutputStream.flush();
                fileOutputStream.close();
                failure = file;
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Toast.makeText(context, "createFile() exception=" + a.getMessage(), 0).show();
        }
        boolean z = failure instanceof Result.Failure;
        Object obj = failure;
        if (z) {
            obj = null;
        }
        File file2 = (File) obj;
        if (file2 != null) {
            try {
                PlusSdkFileProvider.Companion.getClass();
                failure2 = FileProvider.getUriForFile(context, String.format("%s.PlusSdkFileProvider", Arrays.copyOf(new Object[]{context.getPackageName()}, 1)), file2);
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            Throwable a2 = Result.a(failure2);
            if (a2 != null) {
                Toast.makeText(context, "getUriForFile() exception=" + a2.getMessage(), 0).show();
            }
            if (failure2 instanceof Result.Failure) {
                failure2 = null;
            }
            Uri uri = (Uri) failure2;
            if (uri != null) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.setType("text/plain");
                intent.setFlags(1);
                intent.setClipData(ClipData.newRawUri(format, uri));
                Intent createChooser = Intent.createChooser(intent, null);
                createChooser.addFlags(SelfTester_JCP.IMITA);
                context.startActivity(createChooser);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$2(DebugPanelLogsView debugPanelLogsView, View view) {
        debugPanelLogsView.onBackClicked.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$4(DebugPanelLogsView debugPanelLogsView, View view) {
        debugPanelLogsView.changeHeaderVisibility(false);
        debugPanelLogsView.getSearchEditText().requestFocus();
        debugPanelLogsView.showKeyboard(debugPanelLogsView.getSearchEditText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$5(DebugPanelLogsView debugPanelLogsView, View view) {
        debugPanelLogsView.clearSearchQuery();
        debugPanelLogsView.hideKeyboard();
        debugPanelLogsView.changeHeaderVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$6(DebugPanelLogsView debugPanelLogsView, View view) {
        if (debugPanelLogsView.iconSrc == gxg0.plus_debug_panel_ic_arrow_down) {
            debugPanelLogsView.getLogsRecyclerView().scrollToPosition(debugPanelLogsView.logsAdapter.getItemCount() - 1);
        } else {
            debugPanelLogsView.getLogsRecyclerView().scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListeners$lambda$7(DebugPanelLogsView debugPanelLogsView, Editable editable) {
        b bVar = debugPanelLogsView.viewModel;
        String valueOf = String.valueOf(editable);
        bVar.getClass();
        if (evu0.J(valueOf)) {
            bVar.c();
        } else {
            String obj = evu0.k0(valueOf).toString();
            ArrayList arrayList = new ArrayList();
            Regex regex = new Regex(Pattern.quote(obj), RegexOption.IGNORE_CASE);
            int i = 0;
            for (Object obj2 : (Iterable) bVar.i.getValue()) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                ycc.s(arrayList, new yw01(Regex.c(regex, ((jzj) obj2).b), new ii8(i, 3)));
                i = i2;
            }
            r0 r0Var = bVar.j;
            r0Var.getClass();
            r0Var.m(null, arrayList);
            bVar.b();
            bVar.d(0);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupListeners$lambda$8(DebugPanelLogsView debugPanelLogsView, TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 6;
        if (z) {
            debugPanelLogsView.hideKeyboard();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$9(DebugPanelLogsView debugPanelLogsView, View view) {
        b bVar = debugPanelLogsView.viewModel;
        bVar.d((bVar.m + 1) % ((List) bVar.j.getValue()).size());
    }

    private final void setupRecyclerView() {
        RecyclerView logsRecyclerView = getLogsRecyclerView();
        logsRecyclerView.setPadding(logsRecyclerView.getPaddingLeft(), logsRecyclerView.getPaddingTop(), logsRecyclerView.getPaddingRight(), this.insets.d);
        getLogsRecyclerView().setAdapter(this.logsAdapter);
        getLogsRecyclerView().addItemDecoration(new wql(getContext()));
    }

    private final void setupScrollButton() {
        getLogsRecyclerView().addOnScrollListener(new flz(new wvg(this, 0), new uvg(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupScrollButton$lambda$24(final DebugPanelLogsView debugPanelLogsView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(debugPanelLogsView.getScrollImageButton(), CaretView.ALPHA_PROPERTY, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(500L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView$setupScrollButton$lambda$24$lambda$23$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ImageButton scrollImageButton;
                scrollImageButton = DebugPanelLogsView.this.getScrollImageButton();
                scrollImageButton.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupScrollButton$lambda$25(DebugPanelLogsView debugPanelLogsView, int i) {
        debugPanelLogsView.iconSrc = i > 0 ? gxg0.plus_debug_panel_ic_arrow_down : gxg0.plus_debug_panel_ic_arrow_up;
        debugPanelLogsView.getScrollImageButton().setVisibility(0);
        debugPanelLogsView.getScrollImageButton().setAlpha(1.0f);
        debugPanelLogsView.getScrollImageButton().setImageResource(debugPanelLogsView.iconSrc);
        return zy11.a;
    }

    private final void showDialog(List<cez> items, tls onConfirm, sls onReset) {
        List<cez> list = items;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((cez) it.next()).b));
        }
        boolean[] C0 = kotlin.collections.a.C0(arrayList);
        dej dejVar = this.dialogHost;
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        for (cez cezVar : list) {
            arrayList2.add(new hxq(cezVar.a.getResId(), cezVar.b));
        }
        dejVar.showDialog(arrayList2, new tbb(16, C0), new dke(17, onConfirm, C0), onReset, new wvg(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showDialog$lambda$19(boolean[] zArr, int i, boolean z) {
        zArr[i] = z;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showDialog$lambda$20(tls tlsVar, boolean[] zArr, List list) {
        tlsVar.invoke(j73.e0(zArr));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showDialog$lambda$21(DebugPanelLogsView debugPanelLogsView) {
        debugPanelLogsView.viewModel.p.l(null);
        return zy11.a;
    }

    private final void showFieldsDialog(List<cez> items) {
        showDialog(items, new uvg(this, 0), new wvg(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showFieldsDialog$lambda$15(DebugPanelLogsView debugPanelLogsView, List list) {
        Object value;
        ArrayList arrayList;
        b bVar = debugPanelLogsView.viewModel;
        r0 r0Var = bVar.o;
        do {
            value = r0Var.getValue();
            List list2 = (List) value;
            arrayList = new ArrayList(tcc.n(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                arrayList.add(cez.a((cez) obj, ((Boolean) list.get(i)).booleanValue()));
                i = i2;
            }
        } while (!r0Var.k(value, arrayList));
        bVar.p.l(null);
        bVar.a();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showFieldsDialog$lambda$16(DebugPanelLogsView debugPanelLogsView) {
        Object value;
        ArrayList arrayList;
        b bVar = debugPanelLogsView.viewModel;
        r0 r0Var = bVar.o;
        do {
            value = r0Var.getValue();
            List list = (List) value;
            arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cez.a((cez) it.next(), true));
            }
        } while (!r0Var.k(value, arrayList));
        bVar.a();
        return zy11.a;
    }

    private final void showKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    private final void showLevelFilterDialog(List<cez> items) {
        showDialog(items, new uvg(this, 3), new wvg(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showLevelFilterDialog$lambda$13(DebugPanelLogsView debugPanelLogsView, List list) {
        Object value;
        ArrayList arrayList;
        b bVar = debugPanelLogsView.viewModel;
        List J0 = kotlin.collections.a.J0(list);
        r0 r0Var = bVar.n;
        do {
            value = r0Var.getValue();
            List list2 = (List) value;
            arrayList = new ArrayList(tcc.n(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                arrayList.add(cez.a((cez) obj, ((Boolean) J0.get(i)).booleanValue()));
                i = i2;
            }
        } while (!r0Var.k(value, arrayList));
        bVar.p.l(null);
        bVar.a();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showLevelFilterDialog$lambda$14(DebugPanelLogsView debugPanelLogsView) {
        Object value;
        ArrayList arrayList;
        b bVar = debugPanelLogsView.viewModel;
        r0 r0Var = bVar.n;
        do {
            value = r0Var.getValue();
            List list = (List) value;
            arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cez.a((cez) it.next(), true));
            }
        } while (!r0Var.k(value, arrayList));
        bVar.a();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMatchButtonsState(boolean isEnabled) {
        float f = isEnabled ? 1.0f : 0.5f;
        getPreviousMatchImageButton().setEnabled(isEnabled);
        getPreviousMatchImageButton().setAlpha(f);
        getNextMatchImageButton().setEnabled(isEnabled);
        getNextMatchImageButton().setAlpha(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.yandex.plus.home.common.utils.a.b(this.viewModelScope);
    }
}
