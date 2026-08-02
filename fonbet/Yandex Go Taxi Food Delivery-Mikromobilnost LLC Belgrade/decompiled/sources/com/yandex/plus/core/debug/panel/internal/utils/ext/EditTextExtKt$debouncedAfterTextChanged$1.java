package com.yandex.plus.core.debug.panel.internal.utils.ext;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import defpackage.tls;
import defpackage.zz;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/yandex/plus/core/debug/panel/internal/utils/ext/EditTextExtKt$debouncedAfterTextChanged$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lzy11;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "", "lastChangeTime", "J", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EditTextExtKt$debouncedAfterTextChanged$1 implements TextWatcher {
    final /* synthetic */ tls $action;
    final /* synthetic */ long $debounceTimeMs;
    final /* synthetic */ EditText $this_debouncedAfterTextChanged;
    private long lastChangeTime;

    public EditTextExtKt$debouncedAfterTextChanged$1(EditText editText, long j, tls tlsVar) {
        this.$this_debouncedAfterTextChanged = editText;
        this.$debounceTimeMs = j;
        this.$action = tlsVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        this.lastChangeTime = SystemClock.elapsedRealtime();
        EditText editText = this.$this_debouncedAfterTextChanged;
        long j = this.$debounceTimeMs;
        editText.postDelayed(new zz(this, j, this.$action, s), j);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
