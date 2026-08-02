package com.ybsdk.widgets.common;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/ybsdk/widgets/common/SelectionAwareEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", ClidProvider.STATE, "Lzy11;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "selStart", "selEnd", "onSelectionChanged", "(II)V", "", "shouldRestoreSavedInstanceState", "Z", "getShouldRestoreSavedInstanceState", "()Z", "setShouldRestoreSavedInstanceState", "(Z)V", "Lkotlin/Function1;", "Landroid/widget/EditText;", "Ltls;", "getOnSelectionChanged", "()Ltls;", "setOnSelectionChanged", "(Ltls;)V", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectionAwareEditText extends AppCompatEditText {
    private tls onSelectionChanged;
    private boolean shouldRestoreSavedInstanceState;

    public /* synthetic */ SelectionAwareEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final tls getOnSelectionChanged() {
        return this.onSelectionChanged;
    }

    public final boolean getShouldRestoreSavedInstanceState() {
        return this.shouldRestoreSavedInstanceState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!this.shouldRestoreSavedInstanceState) {
            state = null;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (this.shouldRestoreSavedInstanceState) {
            return onSaveInstanceState;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        tls tlsVar = this.onSelectionChanged;
        if (tlsVar != null) {
            tlsVar.invoke(this);
        }
        super.onSelectionChanged(selStart, selEnd);
    }

    public final void setOnSelectionChanged(tls tlsVar) {
        this.onSelectionChanged = tlsVar;
    }

    public final void setShouldRestoreSavedInstanceState(boolean z) {
        this.shouldRestoreSavedInstanceState = z;
    }

    public SelectionAwareEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SelectionAwareEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public SelectionAwareEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.shouldRestoreSavedInstanceState = true;
    }
}
