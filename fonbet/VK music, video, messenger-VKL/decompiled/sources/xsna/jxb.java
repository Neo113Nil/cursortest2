package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.stories.ImStoryState;
import java.util.List;
import java.util.Map;
import xsna.xxd0;

/* compiled from: ChatProfileModelDelegate.kt */
/* loaded from: classes2.dex */
public interface jxb {

    /* compiled from: ChatProfileModelDelegate.kt */
    public interface a {
        void a(Source source);

        xxd0 c();

        void g(uxd0 uxd0Var);

        void h(io.reactivex.rxjava3.disposables.c cVar);

        void i(izs<? super xxd0.b, xxd0.b> izsVar);
    }

    void b(zxd0 zxd0Var);

    xxd0 c(DialogExt dialogExt, ImStoryState imStoryState, y6p y6pVar, List<EduAchievement> list, Map<Peer, p6p> map);

    void d(DialogExt dialogExt);

    void onConfigurationChanged(Configuration configuration);

    void t();

    default void a(sxp sxpVar) {
    }

    default void onActivityResult(int i, int i2, Intent intent) {
    }
}
