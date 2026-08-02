package com.yandex.passport.internal.ui.util;

import android.view.KeyEvent;
import android.widget.TextView;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/passport/internal/ui/util/OnActionDoneListener;", "Landroid/widget/TextView$OnEditorActionListener;", "Lkotlin/Function0;", "Lzy11;", "listener", "<init>", "(Lsls;)V", "Landroid/widget/TextView;", "v", "", "actionId", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "Lsls;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnActionDoneListener implements TextView.OnEditorActionListener {
    public static final int $stable = 0;
    private final sls listener;

    public OnActionDoneListener(sls slsVar) {
        this.listener = slsVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        if (actionId != 6) {
            return false;
        }
        this.listener.invoke();
        return true;
    }
}
