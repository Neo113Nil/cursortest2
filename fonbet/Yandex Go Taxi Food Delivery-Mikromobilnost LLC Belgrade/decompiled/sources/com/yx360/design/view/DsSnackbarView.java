package com.yx360.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.f;
import com.yx360.design.compose.atoms.snackbar.a;
import com.yx360.design.view.base.DsComposeView;
import defpackage.aii0;
import defpackage.bts;
import defpackage.eob;
import defpackage.fid;
import defpackage.l4v;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.vng;
import defpackage.wsm;
import defpackage.x3i0;
import defpackage.ysm;
import defpackage.z4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010$J)\u0010&\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b&\u0010\tJ\u000f\u0010'\u001a\u00020\fH\u0015¢\u0006\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010*¨\u0006+"}, d2 = {"Lcom/yx360/design/view/DsSnackbarView;", "Lcom/yx360/design/view/base/DsComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/String;)V", "Ll4v;", "iconConfig", "setIcon", "(Ll4v;)V", "Lwsm;", "button", "setButton", "(Lwsm;)V", "Leob;", "chevronConfig", "setChevron", "(Leob;)V", "", "durationMillis", "setDurationMillis", "(Ljava/lang/Long;)V", "Lysm;", ClidProvider.STATE, "setState", "(Lysm;)V", "show", "()V", "hide", "parseCustomAttributes", "ComposeContent", "(Lfid;I)V", "Loz40;", "Loz40;", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsSnackbarView extends DsComposeView {
    public static final int $stable = 8;
    private oz40 button;
    private oz40 chevronConfig;
    private oz40 durationMillis;
    private oz40 iconConfig;
    private oz40 state;
    private oz40 title;

    public DsSnackbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.title = f.j("");
        this.iconConfig = f.j(null);
        this.button = f.j(null);
        this.chevronConfig = f.j(null);
        this.durationMillis = f.j(null);
        this.state = f.j(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 ComposeContent$lambda$1(DsSnackbarView dsSnackbarView, int i, fid fidVar, int i2) {
        dsSnackbarView.ComposeContent(fidVar, vng.O(i | 1));
        return zy11.a;
    }

    @Override // com.yx360.design.view.base.DsComposeView
    public void ComposeContent(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1212330015);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (this.iconConfig.getValue() != null) {
                ny61.u();
                return;
            }
            btsVar.e0(-1113004637);
            btsVar.t(false);
            if (this.chevronConfig.getValue() != null) {
                ny61.u();
                return;
            }
            btsVar.e0(-1112990478);
            btsVar.t(false);
            String str = (String) this.title.getValue();
            if (this.button.getValue() != null) {
                ny61.u();
                return;
            }
            Long l = (Long) this.durationMillis.getValue();
            ysm ysmVar = (ysm) this.state.getValue();
            btsVar.e0(-1112970071);
            if (ysmVar == null) {
                ysmVar = a.e(btsVar);
            }
            btsVar.t(false);
            a.a(str, null, null, l, ysmVar, btsVar, 0, 2);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(this, i, 17);
        }
    }

    public final void hide() {
        ysm ysmVar = (ysm) this.state.getValue();
        if (ysmVar != null) {
            ysmVar.a.setValue(Boolean.FALSE);
        }
    }

    @Override // com.yx360.design.view.base.DsComposeView
    public void parseCustomAttributes(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, x3i0.DsSnackbarView, defStyleAttr, 0);
        String string = obtainStyledAttributes.getString(x3i0.DsSnackbarView_title);
        if (string != null) {
            this.title.setValue(string);
        }
        int i = obtainStyledAttributes.getInt(x3i0.DsSnackbarView_durationMillis, -1);
        if (i != -1) {
            this.durationMillis.setValue(Long.valueOf(i));
        }
        obtainStyledAttributes.recycle();
    }

    public final void setButton(wsm button) {
        this.button.setValue(button);
    }

    public final void setChevron(eob chevronConfig) {
        this.chevronConfig.setValue(chevronConfig);
    }

    public final void setDurationMillis(Long durationMillis) {
        this.durationMillis.setValue(durationMillis);
    }

    public final void setIcon(l4v iconConfig) {
        this.iconConfig.setValue(iconConfig);
    }

    public final void setState(ysm state) {
        this.state.setValue(state);
    }

    public final void setTitle(String title) {
        this.title.setValue(title);
    }

    public final void show() {
        ysm ysmVar = (ysm) this.state.getValue();
        if (ysmVar != null) {
            ysmVar.a.setValue(Boolean.TRUE);
        }
    }

    public DsSnackbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DsSnackbarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DsSnackbarView(Context context) {
        this(context, null, 0, 6, null);
    }
}
