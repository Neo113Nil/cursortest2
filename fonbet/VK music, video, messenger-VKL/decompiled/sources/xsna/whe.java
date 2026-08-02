package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.eeu0;
import xsna.hxo;
import xsna.le60;
import xsna.o0r0;
import xsna.rxo;
import xsna.xn50;

/* compiled from: ClipsInterestsRepositoryImpl.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class whe extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ whe(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sg40 sg40Var;
        int i = 3;
        int i2 = 0;
        switch (this.b) {
            case 0:
                fhe fheVar = (fhe) this.receiver;
                fheVar.getClass();
                io.reactivex.rxjava3.internal.operators.single.f0 q = new io.reactivex.rxjava3.internal.operators.single.v(new ehe(i2, fheVar, (List) obj)).q(fheVar.b());
                asu0.a.getClass();
                return q.m(asu0.i());
            case 1:
                com.vk.profile.community.impl.ui.profile.a aVar = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
                aVar.getClass();
                if (fkq0.a(((qwc0) obj).a).equals(fkq0.a(aVar.i.a))) {
                    aVar.C(new CommunityProfileAction.o(false));
                }
                return s3q0.a;
            case 2:
                ugl uglVar = (ugl) this.receiver;
                uglVar.t = true;
                uglVar.q.e();
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                Collection<com.vk.im.engine.models.dialogs.d> collection = (Collection) obj;
                com.vk.im.engine.internal.storage.delegates.dialogs.b bVar = (com.vk.im.engine.internal.storage.delegates.dialogs.b) this.receiver;
                bVar.getClass();
                if (!collection.isEmpty()) {
                    SQLiteStatement g = bVar.b.b().g("REPLACE INTO dialogs_history_count(filter_id,count,phase_id) VALUES(?,?,?)");
                    try {
                        for (com.vk.im.engine.models.dialogs.d dVar : collection) {
                            g.bindLong(1, dVar.a.i());
                            g.bindLong(2, dVar.b);
                            g.bindLong(3, dVar.c);
                            g.executeInsert();
                        }
                        s3q0 s3q0Var = s3q0.a;
                        g.close();
                    } finally {
                    }
                }
                return s3q0.a;
            case 4:
                rxo rxoVar = (rxo) obj;
                txo txoVar = (txo) this.receiver;
                int i3 = txo.q1;
                txoVar.getClass();
                ?? r5 = txoVar.i1;
                if (rxoVar instanceof rxo.c) {
                    rxo.c cVar = (rxo.c) rxoVar;
                    ((com.vk.superapp.multiaccount.api.e) r5.getValue()).i(txoVar.requireContext(), cVar.a, cVar.b);
                    xn50.a.c(txoVar, hxo.b.b);
                } else if (rxoVar instanceof rxo.b) {
                    ((com.vk.superapp.multiaccount.api.e) r5.getValue()).g(txoVar.requireContext(), ((rxo.b) rxoVar).a);
                } else if (rxoVar instanceof rxo.a) {
                    if (txoVar.getParentFragmentManager().T()) {
                        txoVar.tn();
                    } else {
                        txoVar.dismiss();
                    }
                } else if (rxoVar instanceof rxo.d) {
                    Context requireContext = txoVar.requireContext();
                    p3h p3hVar = new p3h(txoVar, 12);
                    com.vk.movika.tools.controls.seekbar.n nVar = new com.vk.movika.tools.controls.seekbar.n(25);
                    eeu0.a aVar2 = new eeu0.a(requireContext, R.style.VkAlertDialogThemePositive);
                    aVar2.c = true;
                    aVar2.B(R.string.vk_multiaccount_logout_dialog_title);
                    aVar2.q(R.string.vk_multiaccount_logout_dialog_message);
                    aVar2.setNegativeButton(R.string.vk_auth_exchange_delete_dialog_cancel, new z140(nVar));
                    aVar2.j(cqm0.b(requireContext.getString(R.string.vk_multiaccount_logout)), new a240(p3hVar, i2));
                    aVar2.m();
                } else if (rxoVar instanceof rxo.f) {
                    rxo.f fVar = (rxo.f) rxoVar;
                    fVar.a.b.a(fVar.b);
                } else {
                    if (!(rxoVar instanceof rxo.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((com.vk.superapp.multiaccount.api.e) txoVar.k1.getValue()).f(txoVar.getParentFragmentManager(), ((rxo.e) rxoVar).a);
                }
                return s3q0.a;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                ((pzh0) this.receiver).i(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 7:
                Playlist playlist = (Playlist) obj;
                xh40 xh40Var = (xh40) this.receiver;
                xh40Var.getClass();
                if (playlist.b != -1 && (sg40Var = xh40Var.g) != null) {
                    String Ib = playlist.Ib();
                    if (DownloadingState.Downloaded.b != null) {
                        sg40Var.n.execute(new cc3(i, Ib, (Object) sg40Var));
                    }
                }
                xh40Var.i.remove(playlist.Ib());
                xh40Var.d.c(playlist.Ib());
                return s3q0.a;
            case 8:
                ((e3a) this.receiver).getClass();
                return e3a.c((CatalogCatalogResponseObjectDto) obj);
            case 9:
                return ((mm50) this.receiver).G((izs) obj);
            case 10:
                le60 le60Var = (le60) obj;
                ge60 ge60Var = (ge60) this.receiver;
                int i4 = ge60.l1;
                ge60Var.getClass();
                if (epx.f(le60Var, le60.a.C3263a.a)) {
                    ge60Var.hide();
                } else if (le60Var instanceof le60.a.b) {
                    ((o0r0) ge60Var.j1.getValue()).m(ge60Var.requireContext(), ((le60.a.b) le60Var).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    ge60Var.hide();
                } else {
                    if (!(le60Var instanceof le60.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context mo2getContext = ge60Var.mo2getContext();
                    if (mo2getContext != null) {
                        le60.b bVar2 = (le60.b) le60Var;
                        hd60.a().e(1000L, mo2getContext, bVar2.a, bVar2.c, (r29 & 64) != 0 ? null : null, null, bVar2.d, (r29 & 128) != 0 ? null : new mu1(20, ge60Var, le60Var), (r29 & 256) != 0 ? null : new defpackage.m(27, ge60Var, le60Var), bVar2.b, false);
                    }
                }
                return s3q0.a;
            case 11:
                L.i((Throwable) obj);
                return s3q0.a;
            case 12:
                ((io.reactivex.rxjava3.subjects.f) this.receiver).onNext((pk50) obj);
                return s3q0.a;
            case 13:
                ((z37) this.receiver).b((sjl0) obj);
                return s3q0.a;
            case 14:
                ((f1o0) this.receiver).T((h1o0) obj);
                return s3q0.a;
            case 15:
                ((com.vk.video.ui.discovery.minimizable.related_videos.k) this.receiver).l((com.vk.video.ui.discovery.minimizable.related_videos.h) obj);
                return s3q0.a;
            default:
                int intValue = ((Number) obj).intValue();
                i4v0 i4v0Var = (i4v0) this.receiver;
                i4v0Var.e.invoke(((MixOption) i4v0Var.c.get(intValue)).b);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whe(Object obj, int i) {
        super(1, obj, fhe.class, "cacheSavedInterestsIds", "cacheSavedInterestsIds(Ljava/util/List;)Lio/reactivex/rxjava3/core/Single;", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, ugl.class, "onFailureLoadHistory", "onFailureLoadHistory(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0);
                break;
            case 11:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whe(xh40 xh40Var) {
        super(1, xh40Var, xh40.class, "finishPlaylistDownloading", "finishPlaylistDownloading(Lcom/vk/dto/music/Playlist;)V", 0);
        this.b = 7;
    }
}
