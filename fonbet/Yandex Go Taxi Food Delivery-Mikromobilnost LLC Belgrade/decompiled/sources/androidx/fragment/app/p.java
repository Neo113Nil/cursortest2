package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import defpackage.u40;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class p implements u40 {
    public final /* synthetic */ FragmentManager a;

    public p(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        FragmentManager fragmentManager = this.a;
        FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = (FragmentManager.LaunchedFragmentInfo) fragmentManager.H.pollFirst();
        if (launchedFragmentInfo == null) {
            return;
        }
        String str = launchedFragmentInfo.mWho;
        int i2 = launchedFragmentInfo.mRequestCode;
        Fragment c = fragmentManager.c.c(str);
        if (c == null) {
            return;
        }
        c.onRequestPermissionsResult(i2, strArr, iArr);
    }
}
