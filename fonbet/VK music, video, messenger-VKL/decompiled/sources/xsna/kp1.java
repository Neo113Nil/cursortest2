package xsna;

import android.animation.ValueAnimator;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gqh;
import xsna.w8h;
import xsna.xn50;

/* compiled from: AlbumsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class kp1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:
    
        if (r9.isPaused() == false) goto L68;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        w8h.c cVar;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(com.vk.photos.root.albums.presentation.e.i((com.vk.photos.root.albums.presentation.e) this.receiver, (com.vk.photos.root.albums.presentation.f) obj));
            case 1:
                ((tuf) this.receiver).getClass();
                List<Pair> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (Pair pair : list) {
                    int i = emf.a;
                    arrayList.add(new Pair(emf.b((ClipUploadJob) pair.i()), xlf.a((ClipUploadJob) pair.i(), (ded) pair.j())));
                }
                return arrayList;
            case 2:
                gqh gqhVar = (gqh) obj;
                w8h w8hVar = (w8h) this.receiver;
                if (gqhVar instanceof gqh.b) {
                    w8h.c cVar2 = w8hVar.h;
                    boolean z = ((gqh.b) gqhVar).a;
                    boolean z2 = cVar2.b;
                    cVar2.getClass();
                    cVar = new w8h.c(z, z2);
                } else {
                    if (!(gqhVar instanceof gqh.a)) {
                        w8hVar.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    w8h.c cVar3 = w8hVar.h;
                    boolean z3 = ((gqh.a) gqhVar).a;
                    boolean z4 = cVar3.a;
                    cVar3.getClass();
                    cVar = new w8h.c(z4, z3);
                }
                w8h.c cVar4 = w8hVar.h;
                boolean z5 = true;
                boolean z6 = false;
                boolean z7 = cVar4.a && cVar4.b;
                boolean z8 = cVar.b;
                boolean z9 = cVar.a;
                boolean z10 = z7 != (z9 && z8);
                w8hVar.h = cVar;
                if (z10) {
                    boolean z11 = z9 && z8;
                    if (z11 && w8hVar.n) {
                        w8hVar.e(null);
                    } else if (!z11) {
                        jyg b = w8hVar.b();
                        if (b != null) {
                            com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = b.q;
                            if (aVar != null) {
                                ValueAnimator valueAnimator = aVar.i;
                                if (valueAnimator != null) {
                                    if (valueAnimator.isRunning()) {
                                        break;
                                    }
                                }
                                z5 = false;
                                z6 = z5;
                            } else {
                                com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar = b.r;
                                if (bVar != null) {
                                    z5 = bVar.h.isPlaying();
                                    z6 = z5;
                                }
                                z5 = false;
                                z6 = z5;
                            }
                        }
                        w8hVar.n = z6;
                        w8hVar.d();
                    }
                }
                return s3q0.a;
            case 3:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 4:
                com.vk.profile.community.impl.ui.profile.f.a((com.vk.profile.community.impl.ui.profile.f) this.receiver, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 5:
                hpm.i((hpm) this.receiver, (com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 6:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 7:
                com.vk.photos.ui.editalbum.domain.c.U((com.vk.photos.ui.editalbum.domain.c) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 8:
                mjx mjxVar = (mjx) this.receiver;
                mjxVar.getClass();
                xn50.a.c(mjxVar, (n7a) obj);
                return s3q0.a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                zcz zczVar = (zcz) this.receiver;
                VoipActionMultiLineView voipActionMultiLineView = zczVar.u;
                voipActionMultiLineView.setSwitchListener(null);
                VoipActionMultiLineView.b(voipActionMultiLineView, booleanValue);
                voipActionMultiLineView.setSwitchListener(zczVar.v);
                return s3q0.a;
            case 10:
                ((j2r0) this.receiver).getClass();
                return j2r0.a((UsersUserFullDto) obj);
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ((VmojiPromoInSuggestsRepositoryImpl) this.receiver).getClass();
                VmojiPromoInSuggestsRepositoryImpl.b(booleanValue2);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp1(Object obj, int i) {
        super(1, obj, com.vk.photos.root.albums.presentation.e.class, "checkShowHeader", "checkShowHeader(Lcom/vk/photos/root/albums/presentation/AlbumsState;)Z", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, tuf.class, "mapNewUploads", "mapNewUploads(Ljava/util/List;)Ljava/util/List;", 0);
                break;
            case 6:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, j2r0.class, "map", "map(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/dto/user/UserProfile;", 0);
                break;
            default:
                break;
        }
    }
}
