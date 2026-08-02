package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.viewcontrollers.dialog_header.info.RefreshInfo;
import com.vk.im.ui.components.viewcontrollers.dialog_header.info.c;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: State.kt */
/* loaded from: classes2.dex */
public final class dtk0 {
    public int d;
    public final hcm f;
    public List<? extends u8m> g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ImStoryState l;
    public boolean m;
    public boolean a = true;
    public Dialog b = new Dialog();
    public ProfilesSimpleInfo c = new ProfilesSimpleInfo();
    public RefreshInfo e = RefreshInfo.DISCONNECTED;

    public dtk0() {
        long longValue = this.b.Sb().longValue();
        EmptyList emptyList = EmptyList.b;
        this.f = new hcm(longValue, emptyList);
        this.g = emptyList;
        this.k = true;
        this.l = ImStoryState.NONE;
    }

    public final com.vk.im.ui.components.viewcontrollers.dialog_header.info.c a() {
        String str;
        a1w a1wVar = q1w.a;
        biu biuVar = null;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        boolean uc = this.b.uc();
        GroupCallInProgress Ob = this.b.Ob();
        if (Ob != null && (str = Ob.c) != null) {
            String str2 = Ob.d;
            Ob.b.size();
            biuVar = new biu(str, str2);
        }
        return (!o25.b(o25.a()) || this.b.Gb()) ? !this.h ? c.d.a : biuVar != null ? new c.e(biuVar) : !this.b.t1() ? new c.a(uc) : this.i ? c.C1163c.a : c.b.a : c.d.a;
    }

    public final DialogExt b() {
        return new DialogExt(this.b, new ProfilesInfo(this.c));
    }
}
