package com.yx360.design.view.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AbstractComposeView;
import com.yx360.design.BrandTheme;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cma1;
import defpackage.fid;
import defpackage.j73;
import defpackage.oz40;
import defpackage.qnm;
import defpackage.tb61;
import defpackage.vng;
import defpackage.vpm;
import defpackage.wwg;
import defpackage.x3i0;
import defpackage.z4;
import defpackage.zb61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH%¢\u0006\u0004\b\u001e\u0010\u001dR\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"Lcom/yx360/design/view/base/DsComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yx360/design/BrandTheme;", "brandTheme", "Lzy11;", "setBrandTheme", "(Lcom/yx360/design/BrandTheme;)V", "", "darkTheme", "setDarkTheme", "(Ljava/lang/Boolean;)V", "Ltb61;", "imageLoader", "setImageLoader", "(Ltb61;)V", "Lzb61;", "videoLoader", "setVideoLoader", "(Lzb61;)V", "parseCustomAttributes", "Content", "(Lfid;I)V", "ComposeContent", "Loz40;", "Loz40;", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DsComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private oz40 brandTheme;
    private oz40 darkTheme;
    private oz40 imageLoader;
    private oz40 videoLoader;

    public DsComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.brandTheme = f.j(null);
        this.darkTheme = f.j(null);
        this.imageLoader = f.j(null);
        this.videoLoader = f.j(null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x3i0.DsComposeView, i, 0);
            setBrandTheme((BrandTheme) ((Enum) j73.G(obtainStyledAttributes.getInt(x3i0.DsComposeView_brandTheme, -1), BrandTheme.values())));
            int i2 = x3i0.DsComposeView_darkTheme;
            setDarkTheme(obtainStyledAttributes.hasValue(i2) ? Boolean.valueOf(obtainStyledAttributes.getBoolean(i2, false)) : null);
            obtainStyledAttributes.recycle();
            parseCustomAttributes(context, attributeSet, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 Content$lambda$1(DsComposeView dsComposeView, int i, fid fidVar, int i2) {
        dsComposeView.Content(fidVar, vng.O(i | 1));
        return zy11.a;
    }

    public abstract void ComposeContent(fid fidVar, int i);

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(807874244);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm qnmVar = qnm.a;
            Boolean bool = (Boolean) this.darkTheme.getValue();
            btsVar.e0(-1021929204);
            boolean f0 = bool == null ? cma1.f0(btsVar) : bool.booleanValue();
            btsVar.t(false);
            qnmVar.a(f0, (BrandTheme) this.brandTheme.getValue(), wwg.S(-1434788311, true, new vpm(this, 1), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(this, i, 15);
        }
    }

    public void parseCustomAttributes(Context context, AttributeSet attrs, int defStyleAttr) {
    }

    public final void setBrandTheme(BrandTheme brandTheme) {
        this.brandTheme.setValue(brandTheme);
    }

    public final void setDarkTheme(Boolean darkTheme) {
        this.darkTheme.setValue(darkTheme);
    }

    public final void setImageLoader(tb61 imageLoader) {
        this.imageLoader.setValue(imageLoader);
    }

    public final void setVideoLoader(zb61 videoLoader) {
        this.videoLoader.setValue(videoLoader);
    }

    public DsComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DsComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DsComposeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
