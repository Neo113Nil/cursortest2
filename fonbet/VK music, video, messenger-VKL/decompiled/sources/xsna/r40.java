package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.likes.dto.LikesItemReactionDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.newsfeed.impl.domain.model.ActionWithOfflineSupportType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.d4c0;

/* compiled from: ActionRemoteRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class r40 implements l40 {

    /* compiled from: ActionRemoteRepositoryImpl.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionWithOfflineSupportType.values().length];
            try {
                iArr[ActionWithOfflineSupportType.ADD_LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionWithOfflineSupportType.DELETE_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static d4c0.a b(LikesItemReactionsDto likesItemReactionsDto, int i, boolean z) {
        ArrayList arrayList;
        List<LikesItemReactionDto> d;
        if (likesItemReactionsDto == null || (d = likesItemReactionsDto.d()) == null) {
            arrayList = new ArrayList();
        } else {
            List<LikesItemReactionDto> list = d;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            for (LikesItemReactionDto likesItemReactionDto : list) {
                arrayList2.add(new ItemReaction(likesItemReactionDto.getId(), likesItemReactionDto.getCount()));
            }
            arrayList = p4g.q(arrayList2);
        }
        return new d4c0.a(i, new ItemReactions(arrayList, likesItemReactionsDto != null ? likesItemReactionsDto.getCount() : 0, 0, likesItemReactionsDto != null ? likesItemReactionsDto.e() : null), z);
    }

    @Override // xsna.l40
    public final io.reactivex.rxjava3.internal.operators.single.e0 a(x60 x60Var) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"Offline:ActionRemoteRepositoryImpl", "Send action " + ((Object) b70.c(x60Var.c())) + " to backend."});
        }
        int i = a.$EnumSwitchMapping$0[x60Var.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dvl dvlVar = (dvl) x60Var.a();
            return new io.reactivex.rxjava3.internal.operators.single.e0(rsg0.w0(yfb.x(k0x.e(new k0x(4), dn00.b(dvlVar.c()).j(), (int) dvlVar.b(), dvlVar.d(), dvlVar.a(), dvlVar.e(), dvlVar.f(), PsExtractor.AUDIO_STREAM))).l(new com.vk.movika.sdk.base.hooks.f(new p40(x60Var, this), 1)), new q40(new s9(x60Var, this), 0));
        }
        AddLikeAction addLikeAction = (AddLikeAction) x60Var.a();
        k0x k0xVar = new k0x(4);
        String j = dn00.b(addLikeAction.c()).j();
        int b = (int) addLikeAction.b();
        UserId d = addLikeAction.d();
        Integer e = addLikeAction.e();
        String a2 = addLikeAction.a();
        String f = addLikeAction.f();
        String g = addLikeAction.g();
        AddLikeAction.TriggerType h = addLikeAction.h();
        return new io.reactivex.rxjava3.internal.operators.single.e0(rsg0.w0(yfb.x(k0x.d(k0xVar, j, b, d, e, a2, f, g, h != null ? dn00.a(h) : null, Tensorflow.FRAME_HEIGHT))).l(new m40(new k00(x60Var, this), 0)), new o40(new n40(x60Var, this), 0));
    }
}
