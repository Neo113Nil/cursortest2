package xsna;

import android.app.backup.BackupManager;
import android.net.Uri;
import androidx.camera.view.PreviewView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.dto.stickers.RecommendationsScrollMode;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.stickers.keyboard.StickersView;
import java.util.Iterator;
import java.util.List;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.g73;
import xsna.sal0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class i73 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i73(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                ((z63) this.c).invoke(new g73.a.C2917a((Throwable) this.d));
                return;
            case 1:
                ((tge) this.c).setItems((List) this.d);
                return;
            case 2:
                hsp0 hsp0Var = (hsp0) this.c;
                DebugUserSettingsFragment debugUserSettingsFragment = (DebugUserSettingsFragment) this.d;
                int i2 = DebugUserSettingsFragment.l0;
                hsp0Var.b();
                new BackupManager(debugUserSettingsFragment.mo2getContext()).dataChanged();
                return;
            case 3:
                ((EffectHolder) this.c).lambda$handleGalleryItemDeselected$25((EffectNativeSink) this.d);
                return;
            case 4:
                PreviewView.this.i.a((zjn0) this.d);
                return;
            case 5:
                ohd0 ohd0Var = (ohd0) this.c;
                svx0 svx0Var = (svx0) this.d;
                synchronized (ohd0Var.k) {
                    try {
                        Iterator it = ohd0Var.j.iterator();
                        while (it.hasNext()) {
                            ((e3q) it.next()).b(svx0Var, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 6:
                QuestionsListFragment questionsListFragment = (QuestionsListFragment) this.c;
                com.vk.profile.questions.impl.d dVar = (com.vk.profile.questions.impl.d) this.d;
                int i3 = QuestionsListFragment.f0;
                kqe0 kqe0Var = (kqe0) questionsListFragment.S;
                if (kqe0Var != null) {
                    kqe0Var.k4(dVar);
                }
                QuestionsListFragment.mo(SchemeStat$TypeQuestionItem.Type.DELETE, dVar.b());
                return;
            case 7:
                StickersView stickersView = (StickersView) this.c;
                RecommendationsScrollMode recommendationsScrollMode = (RecommendationsScrollMode) this.d;
                ral0 ral0Var = stickersView.z;
                boolean z = recommendationsScrollMode == RecommendationsScrollMode.SCROLL_LAST_ROW;
                sal0 sal0Var = ral0Var.c;
                if (sal0Var != null) {
                    Iterator<? extends hfz> it2 = sal0Var.c.h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                        } else if (!(it2.next() instanceof wfy)) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        sal0.b bVar = new sal0.b(sal0Var.getContext(), z);
                        RecyclerView.o layoutManager = sal0Var.b.getLayoutManager();
                        if (layoutManager != null) {
                            bVar.setTargetPosition(i);
                            layoutManager.startSmoothScroll(bVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                hwl0 hwl0Var = (hwl0) this.c;
                Uri uri = (Uri) this.d;
                Reef m = hwl0Var.m();
                if (m != null) {
                    m.a(new ReefEvent.o(uri));
                    return;
                }
                return;
            case 9:
                ((com.my.tracker.obfuscated.e0) this.c).b((com.my.tracker.obfuscated.b3) this.d);
                return;
            default:
                ((yads.pk0) this.c).c((yads.qk0) this.d);
                return;
        }
    }
}
