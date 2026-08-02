package xsna;

import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.group.Group;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.f;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.Arrays;
import kotlin.Result;
import xsna.bzp0;
import xsna.ngl;
import xsna.qn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h3i implements m6h, ngl.a, z960, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h3i(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m6h
    public void b(boolean z, boolean z2, FullSourceJoinApi fullSourceJoinApi) {
        CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) this.b;
        f.a aVar = (f.a) this.c;
        n6h n6hVar = (n6h) communitySuggestionsFragment.U.getValue();
        Group group = aVar.a;
        String str = aVar.b;
        String str2 = communitySuggestionsFragment.S;
        if (str2 == null) {
            str2 = null;
        }
        n6hVar.c(group, z, str2, str, fullSourceJoinApi);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        com.vk.auth.enterphone.a aVar = (com.vk.auth.enterphone.a) this.b;
        aVar.o0((String) this.c, null, aVar.z, cVar.a);
    }

    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        z960 z960Var = (z960) this.b;
        jqp jqpVar = (jqp) this.c;
        z960Var.g(vkContextMenu, i);
        jqpVar.m(null);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        qn60 qn60Var = (qn60) this.b;
        qn60.b[] bVarArr = (qn60.b[]) this.c;
        Object f = qn60Var.f((qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (!(f instanceof Result.Failure)) {
            yVar.onSuccess((qn60.c) f);
        }
        Throwable a = Result.a(f);
        if (a != null) {
            yVar.onError(a);
        }
    }
}
