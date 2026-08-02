package com.yandex.dsl.views;

import android.view.KeyEvent;
import android.widget.TextView;
import defpackage.wls;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class TextViewKt$onEditorAction$1 implements TextView.OnEditorActionListener {
    final /* synthetic */ wls $actionListener;

    public TextViewKt$onEditorAction$1(wls wlsVar) {
        this.$actionListener = wlsVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return ((Boolean) this.$actionListener.invoke(Integer.valueOf(i), keyEvent)).booleanValue();
    }
}
