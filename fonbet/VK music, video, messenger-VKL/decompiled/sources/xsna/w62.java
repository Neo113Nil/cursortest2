package xsna;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.StatFs;
import com.vk.accountmanager.di.AccountManagerComponentImpl;
import com.vk.catalog.mvi.section.impl.di.CatalogComponentImpl;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.menu.di.MenuComponent;
import com.vk.superapp.vkhealth.impl.di.VkHealthComponentImpl;
import com.vk.superapp.vkworkout.widget.impl.di.VkWorkoutWidgetBridgeComponentImpl;
import com.vk.tabbar.core.api.di.TabbarCoreComponent;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import xsna.ihl0;
import xsna.pzv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w62 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w62(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String format;
        int i = this.b;
        ?? r3 = this.c;
        switch (i) {
            case 0:
                return ((SQLiteOpenHelper) ((y62) r3).a.getValue()).getWritableDatabase();
            case 1:
                qcy<Object>[] qcyVarArr = CatalogComponentImpl.j;
                return ((ClipsEntryPointsComponent) r3.getValue()).e();
            case 2:
                gxw gxwVar = (gxw) r3;
                k820 md = ((MenuComponent) gxwVar.c().a(fpf0.a(MenuComponent.class))).md();
                t6g0 t6g0Var = t6g0.b;
                return new s58(md, t6g0.b(), ((TabbarCoreComponent) gxwVar.c().a(fpf0.a(TabbarCoreComponent.class))).y8());
            case 3:
                LinksBridgeComponentImpl linksBridgeComponentImpl = (LinksBridgeComponentImpl) r3;
                qcy<Object>[] qcyVarArr2 = LinksBridgeComponentImpl.H;
                zf6 zf6Var = new zf6(linksBridgeComponentImpl, 8);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                int i2 = 3;
                int i3 = 5;
                return new o2v0(msy.a(lazyThreadSafetyMode, zf6Var), msy.a(lazyThreadSafetyMode, new a67(linksBridgeComponentImpl, 7)), msy.a(lazyThreadSafetyMode, new ib8(linksBridgeComponentImpl, 4)), msy.a(lazyThreadSafetyMode, new kb8(linksBridgeComponentImpl, 4)), msy.a(lazyThreadSafetyMode, new lb8(linksBridgeComponentImpl, 1)), msy.a(lazyThreadSafetyMode, new egv(linksBridgeComponentImpl, i2)), msy.a(lazyThreadSafetyMode, new sz2(linksBridgeComponentImpl, 3)), msy.a(lazyThreadSafetyMode, new bia(linksBridgeComponentImpl, i3)), msy.a(lazyThreadSafetyMode, new cia(linksBridgeComponentImpl, i2)), msy.a(lazyThreadSafetyMode, new dia(linksBridgeComponentImpl, 2)), msy.a(lazyThreadSafetyMode, new m15(linksBridgeComponentImpl, i3)), msy.a(lazyThreadSafetyMode, new eia(linksBridgeComponentImpl, 3)), msy.a(lazyThreadSafetyMode, new rb8(linksBridgeComponentImpl, 2)), msy.a(lazyThreadSafetyMode, new sb8(linksBridgeComponentImpl, 3)), msy.a(lazyThreadSafetyMode, new tb8(linksBridgeComponentImpl, 4)), msy.a(lazyThreadSafetyMode, new ub8(linksBridgeComponentImpl, 3)), msy.a(lazyThreadSafetyMode, new n03(linksBridgeComponentImpl, 3)), msy.a(lazyThreadSafetyMode, new vb8(linksBridgeComponentImpl, 3)), msy.a(lazyThreadSafetyMode, new ip(linksBridgeComponentImpl, 4)), msy.a(lazyThreadSafetyMode, new np(linksBridgeComponentImpl, 7)), msy.a(lazyThreadSafetyMode, new z56(linksBridgeComponentImpl, 5)), msy.a(lazyThreadSafetyMode, new b67(linksBridgeComponentImpl, 5)), msy.a(lazyThreadSafetyMode, new jhg(linksBridgeComponentImpl, 1)), msy.a(lazyThreadSafetyMode, new g3j(linksBridgeComponentImpl, 2)), msy.a(lazyThreadSafetyMode, new fb8(linksBridgeComponentImpl, 1)), msy.a(lazyThreadSafetyMode, new gb8(linksBridgeComponentImpl, 2)), msy.a(lazyThreadSafetyMode, new g67(linksBridgeComponentImpl, 3)), msy.a(lazyThreadSafetyMode, new ag6(linksBridgeComponentImpl, 5)), msy.a(lazyThreadSafetyMode, new bg6(linksBridgeComponentImpl, 4)), msy.a(lazyThreadSafetyMode, new xsa(linksBridgeComponentImpl, 2)), msy.a(lazyThreadSafetyMode, new jb8(linksBridgeComponentImpl, 3)), linksBridgeComponentImpl.F);
            case 4:
                return (AccountManagerComponentImpl.a) r3;
            case 5:
                ihl0.a aVar = (ihl0.a) r3;
                Peer peer = aVar.b;
                try {
                    StatFs statFs = new StatFs(com.vk.core.files.a.j().getAbsolutePath());
                    long j = 1024;
                    if (((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / j) / j < 300.0f) {
                        return null;
                    }
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.q(e);
                }
                peer.getClass();
                if (peer.Ab(Peer.Type.GROUP)) {
                    pzv.a aVar2 = pzv.x0;
                    long j2 = peer.b;
                    aVar2.getClass();
                    format = String.format("vkim-group%s.sqlite", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
                } else {
                    UserCredentials a = aVar.a.a();
                    if (a == null) {
                        return null;
                    }
                    long g = a.g();
                    pzv.x0.getClass();
                    format = String.format("vkim-%s.sqlite", Arrays.copyOf(new Object[]{Long.valueOf(g)}, 1));
                }
                return format;
            case 6:
                return (VideoMinimizablePlayerComponent) ((g8m) r3).a(fpf0.a(VideoMinimizablePlayerComponent.class));
            case 7:
                VkHealthComponentImpl vkHealthComponentImpl = (VkHealthComponentImpl) r3;
                return new d1v(vkHealthComponentImpl.a.Wb(), vkHealthComponentImpl.b.Te(), vkHealthComponentImpl.c.v5(), vkHealthComponentImpl.d.l3());
            default:
                return new x2w0(((VkWorkoutWidgetBridgeComponentImpl) r3).a.v5());
        }
    }
}
