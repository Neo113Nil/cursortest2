package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.bb1;
import defpackage.cmh0;
import defpackage.fnb0;
import defpackage.jr31;
import defpackage.jxg0;
import defpackage.m810;
import defpackage.nvg0;
import defpackage.u9h0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J7\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R$\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u0010/\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(R\u0014\u00100\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010(R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010(R\u0018\u00103\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R$\u0010\n\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/statusandfamily/PlusPanelStatusAndFamilyView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "initViews", "()V", "themedContext", "onThemeChanged", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/View$OnClickListener;", "onStatusClickListener", "setOnStatusClickListener", "(Landroid/view/View$OnClickListener;)V", "onFamilyClickListener", "setOnFamilyClickListener", "count", "", "Landroid/widget/ImageView;", "createAvatarViews", "(I)Ljava/util/List;", "Landroid/view/ViewGroup;", "statusContainer", "Landroid/view/ViewGroup;", "familyContainer", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/statusandfamily/OverlappingImagesView;", "avatarsContainer", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/statusandfamily/OverlappingImagesView;", "currentLayoutId", CA20Status.STATUS_USER_I, "longLayoutMinWidth", "value", "isShortLayout", "Z", "()Z", "shortLayoutAvatarSize", "longLayoutAvatarSize", "shortLayoutMaxAvatarOffset", "longLayoutMaxAvatarOffset", "avatarOutlineWidth", "statusClickListener", "Landroid/view/View$OnClickListener;", "familyClickListener", "Landroid/content/Context;", "getThemedContext", "()Landroid/content/Context;", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelStatusAndFamilyView extends LinearLayout {
    private final int avatarOutlineWidth;
    private OverlappingImagesView avatarsContainer;
    private int currentLayoutId;
    private View.OnClickListener familyClickListener;
    private ViewGroup familyContainer;
    private boolean isShortLayout;
    private final int longLayoutAvatarSize;
    private final int longLayoutMaxAvatarOffset;
    private final int longLayoutMinWidth;
    private final int shortLayoutAvatarSize;
    private final int shortLayoutMaxAvatarOffset;
    private View.OnClickListener statusClickListener;
    private ViewGroup statusContainer;
    private Context themedContext;

    public PlusPanelStatusAndFamilyView(Context context) {
        super(context);
        this.currentLayoutId = cmh0.plus_sdk_panel_status_and_family_view_short;
        this.longLayoutMinWidth = getResources().getDimensionPixelSize(nvg0.plus_sdk_panel_family_long_layout_min_width);
        this.isShortLayout = true;
        this.shortLayoutAvatarSize = m810.b(getResources().getDimension(nvg0.plus_sdk_panel_status_and_family_small_avatar_size));
        this.longLayoutAvatarSize = m810.b(getResources().getDimension(nvg0.plus_sdk_panel_status_and_family_big_avatar_size));
        this.shortLayoutMaxAvatarOffset = m810.b(getResources().getDimension(nvg0.plus_sdk_panel_status_and_family_small_avatar_margin));
        this.longLayoutMaxAvatarOffset = m810.b(getResources().getDimension(nvg0.plus_sdk_panel_status_and_family_big_avatar_margin));
        this.avatarOutlineWidth = m810.b(getResources().getDimension(nvg0.plus_sdk_panel_status_and_family_avatar_outline_width));
        this.themedContext = context;
        setOrientation(1);
        bb1.v(this, this.currentLayoutId, true);
        initViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView createAvatarViews$lambda$0(View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    private final void initViews() {
        this.statusContainer = (ViewGroup) findViewById(u9h0.plus_panel_status_container);
        this.familyContainer = (ViewGroup) findViewById(u9h0.plus_panel_family_container);
        this.avatarsContainer = (OverlappingImagesView) findViewById(u9h0.plus_panel_family_avatars_image_view);
    }

    public final List<ImageView> createAvatarViews(int count) {
        OverlappingImagesView overlappingImagesView = this.avatarsContainer;
        if (overlappingImagesView != null) {
            boolean z = this.isShortLayout;
            overlappingImagesView.setProperties(z ? this.shortLayoutAvatarSize : this.longLayoutAvatarSize, z ? this.shortLayoutMaxAvatarOffset : this.longLayoutMaxAvatarOffset, this.avatarOutlineWidth);
        }
        OverlappingImagesView overlappingImagesView2 = this.avatarsContainer;
        if (overlappingImagesView2 != null) {
            overlappingImagesView2.setMask(jxg0.plus_sdk_ic_family_empty_new);
        }
        OverlappingImagesView overlappingImagesView3 = this.avatarsContainer;
        if (overlappingImagesView3 != null) {
            overlappingImagesView3.setImagesCount(count);
        }
        OverlappingImagesView overlappingImagesView4 = this.avatarsContainer;
        return overlappingImagesView4 != null ? b.s(b.o(new jr31(overlappingImagesView4, 0), new fnb0(21))) : EmptyList.a;
    }

    public final Context getThemedContext() {
        return this.themedContext;
    }

    /* renamed from: isShortLayout, reason: from getter */
    public final boolean getIsShortLayout() {
        return this.isShortLayout;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        boolean z = right - left < this.longLayoutMinWidth;
        this.isShortLayout = z;
        int i = z ? cmh0.plus_sdk_panel_status_and_family_view_short : cmh0.plus_sdk_panel_status_and_family_view_long;
        if (i != this.currentLayoutId) {
            this.currentLayoutId = i;
            removeAllViews();
            bb1.v(this, i, true);
            initViews();
            setOnStatusClickListener(this.statusClickListener);
            setOnFamilyClickListener(this.familyClickListener);
        }
    }

    public void onThemeChanged(Context themedContext) {
        this.themedContext = themedContext;
    }

    public final void setOnFamilyClickListener(View.OnClickListener onFamilyClickListener) {
        this.familyClickListener = onFamilyClickListener;
        ViewGroup viewGroup = this.familyContainer;
        if (viewGroup != null) {
            bb1.L(viewGroup, onFamilyClickListener);
        }
    }

    public final void setOnStatusClickListener(View.OnClickListener onStatusClickListener) {
        this.statusClickListener = onStatusClickListener;
        ViewGroup viewGroup = this.statusContainer;
        if (viewGroup != null) {
            bb1.L(viewGroup, onStatusClickListener);
        }
    }
}
