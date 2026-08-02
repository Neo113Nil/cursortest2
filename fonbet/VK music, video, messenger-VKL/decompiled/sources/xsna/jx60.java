package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vkontakte.android.audio.file.StorageType;
import com.vkontakte.android.fragments.SettingsGeneralFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jx60 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jx60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                Integer num = (Integer) obj5;
                Integer num2 = (Integer) obj4;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj3;
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj2;
                sq60 sq60Var = (sq60) obj;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                if (num != null && num2 != null && linearLayoutManager != null) {
                    linearLayoutManager.K(num.intValue(), num2.intValue());
                }
                if (sq60Var.d) {
                    RecyclerView recyclerView = newsfeedSearchFragment.d0;
                    RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                    LinearLayoutManager linearLayoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.K(0, 0);
                    }
                }
                ((o170) newsfeedSearchFragment.fo().a.V.getValue()).b(newsfeedSearchFragment.d0);
                ((bs60) newsfeedSearchFragment.fo().a.d0.getValue()).a(sq60Var.a);
                ehv ehvVar = (ehv) newsfeedSearchFragment.fo().e.b;
                if (ehvVar != null) {
                    ehvVar.r();
                    break;
                }
                break;
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj5;
                StorageType storageType = (StorageType) obj4;
                StorageType storageType2 = (StorageType) obj3;
                f2j0 f2j0Var = (f2j0) obj2;
                ner0 ner0Var = (ner0) obj;
                int i2 = SettingsGeneralFragment.z0;
                try {
                    dbr.a(storageType, storageType2, f2j0Var);
                    settingsGeneralFragment.l0 = storageType2;
                    break;
                } catch (Exception e) {
                    L.f("vk", "Error moving", e);
                    pro0.c(new ugq(settingsGeneralFragment, ner0Var, e.getLocalizedMessage(), storageType));
                }
        }
    }
}
