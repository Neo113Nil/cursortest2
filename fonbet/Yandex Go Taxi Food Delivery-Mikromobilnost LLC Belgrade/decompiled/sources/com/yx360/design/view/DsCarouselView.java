package com.yx360.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.f;
import com.yx360.design.view.base.DsComposeView;
import defpackage.aii0;
import defpackage.bts;
import defpackage.fid;
import defpackage.oz40;
import defpackage.qpm;
import defpackage.sls;
import defpackage.vng;
import defpackage.x3i0;
import defpackage.yx40;
import defpackage.z4;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010\u0015\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R*\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006$"}, d2 = {"Lcom/yx360/design/view/DsCarouselView;", "Lcom/yx360/design/view/base/DsComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lzy11;", "Lcom/yx360/design/view/ClickListener;", "onCloseClick", "setOnCloseClickListener", "(Lsls;)V", "", "", "pages", "setPages", "(Ljava/util/List;)V", "initialPage", "setInitialPage", "(I)V", "", "enable", "setEdgeToEdgeEnabled", "(Z)V", "parseCustomAttributes", "ComposeContent", "(Lfid;I)V", "Loz40;", "Loz40;", "Lyx40;", "Lyx40;", "enableEdgeToEdge", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DsCarouselView extends DsComposeView {
    public static final int $stable = 8;
    private oz40 enableEdgeToEdge;
    private yx40 initialPage;
    private oz40 onCloseClick;
    private oz40 pages;

    public DsCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pages = f.j(EmptyList.a);
        this.initialPage = f.g(0);
        this.enableEdgeToEdge = f.j(Boolean.TRUE);
        this.onCloseClick = f.j(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 ComposeContent$lambda$1(DsCarouselView dsCarouselView, int i, fid fidVar, int i2) {
        dsCarouselView.ComposeContent(fidVar, vng.O(i | 1));
        return zy11.a;
    }

    @Override // com.yx360.design.view.base.DsComposeView
    public void ComposeContent(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(387536299);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            qpm.b((List) this.pages.getValue(), null, this.initialPage.getIntValue(), (sls) this.onCloseClick.getValue(), ((Boolean) this.enableEdgeToEdge.getValue()).booleanValue(), btsVar, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(this, i, 14);
        }
    }

    @Override // com.yx360.design.view.base.DsComposeView
    public void parseCustomAttributes(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, x3i0.DsCarouselView, defStyleAttr, 0);
        this.initialPage.setIntValue(obtainStyledAttributes.getInt(x3i0.DsCarouselView_initialPage, 0));
        this.enableEdgeToEdge.setValue(Boolean.valueOf(obtainStyledAttributes.getBoolean(x3i0.DsCarouselView_enableEdgeToEdge, true)));
        obtainStyledAttributes.recycle();
    }

    public final void setEdgeToEdgeEnabled(boolean enable) {
        this.enableEdgeToEdge.setValue(Boolean.valueOf(enable));
    }

    public final void setInitialPage(int initialPage) {
        this.initialPage.setIntValue(initialPage);
    }

    public final void setOnCloseClickListener(sls onCloseClick) {
        this.onCloseClick.setValue(onCloseClick);
    }

    public final void setPages(List<Object> pages) {
        this.pages.setValue(pages);
    }

    public DsCarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DsCarouselView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DsCarouselView(Context context) {
        this(context, null, 0, 6, null);
    }
}
