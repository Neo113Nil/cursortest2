package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import xsna.ify;
import xsna.skm0;

/* compiled from: IStoryView.kt */
/* loaded from: classes6.dex */
public interface uov extends DialogInterface.OnDismissListener, qo6, y5p0, skm0.a, ify.a {
    void Ji();

    Dialog Nf(ymm0 ymm0Var, View.OnClickListener onClickListener);

    xkm0 getAnalyticsParams();

    iz8 getCadreSize();

    elm0 getCallback();

    Context getCtx();

    Bitmap getCurrentBitmap();

    ViewGroup getView();

    MobileOfficialAppsConStoriesStat$ViewEntryPoint getViewEntryPoint();

    void setActionInProgress(boolean z);

    void setBottomVisible(boolean z);

    void tj();
}
