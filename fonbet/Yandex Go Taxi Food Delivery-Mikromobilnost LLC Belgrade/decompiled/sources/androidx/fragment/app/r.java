package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentManager;
import defpackage.u40;

/* loaded from: classes.dex */
public final class r implements u40 {
    public final /* synthetic */ FragmentManager a;

    public r(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        FragmentManager fragmentManager = this.a;
        FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = (FragmentManager.LaunchedFragmentInfo) fragmentManager.H.pollLast();
        if (launchedFragmentInfo == null) {
            return;
        }
        String str = launchedFragmentInfo.mWho;
        int i = launchedFragmentInfo.mRequestCode;
        Fragment c = fragmentManager.c.c(str);
        if (c == null) {
            return;
        }
        c.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
    }
}
