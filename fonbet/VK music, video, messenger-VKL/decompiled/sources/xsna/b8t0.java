package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.video.profile.presentation.h;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.j7t0;

/* compiled from: VideoProfileFeature.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class b8t0 extends FunctionReferenceImpl implements yzs<StateSubscribeNotification, UserId, Boolean, s3q0> {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yzs
    public final s3q0 invoke(StateSubscribeNotification stateSubscribeNotification, UserId userId, Boolean bool) {
        final StateSubscribeNotification stateSubscribeNotification2 = stateSubscribeNotification;
        final UserId userId2 = userId;
        final boolean booleanValue = bool.booleanValue();
        com.vk.video.profile.presentation.c cVar = (com.vk.video.profile.presentation.c) this.receiver;
        final j7t0 j7t0Var = (j7t0) cVar.t.getValue();
        j7t0Var.a.b(new buz(12, new vw4(1, j7t0Var, j7t0.class, "shouldUpdate", "shouldUpdate(Lcom/vk/catalog2/common/dto/ui/UIBlockList;)Z", 0, 16), new wzs() { // from class: xsna.i7t0
            /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x00f8 A[SYNTHETIC] */
            @Override // xsna.wzs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj, Object obj2) {
                Group b;
                boolean z;
                oap<? extends UserProfile, ? extends Group> oapVar;
                Group b2;
                UIBlockList uIBlockList = (UIBlockList) obj;
                int[] iArr = j7t0.a.$EnumSwitchMapping$0;
                StateSubscribeNotification stateSubscribeNotification3 = StateSubscribeNotification.this;
                int i = iArr[stateSubscribeNotification3.ordinal()];
                j7t0 j7t0Var2 = j7t0Var;
                if (i != 1) {
                    UserId userId3 = userId2;
                    if (i == 2) {
                        ArrayList<UIBlock> arrayList = uIBlockList.y;
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        for (Object obj3 : arrayList) {
                            int i3 = i2 + 1;
                            UserId userId4 = null;
                            if (i2 < 0) {
                                e43.t();
                                throw null;
                            }
                            UIBlock uIBlock = (UIBlock) obj3;
                            if (fkq0.b(userId3)) {
                                UIBlockSearchAuthor uIBlockSearchAuthor = uIBlock instanceof UIBlockSearchAuthor ? (UIBlockSearchAuthor) uIBlock : null;
                                if (uIBlockSearchAuthor != null && (oapVar = uIBlockSearchAuthor.y) != null && (b2 = oapVar.b()) != null) {
                                    userId4 = b2.c;
                                }
                                if (epx.f(userId4, fkq0.a(userId3))) {
                                    z = true;
                                    if (z) {
                                        j7t0Var2.b = Integer.valueOf(i2);
                                        j7t0Var2.c = uIBlock;
                                    }
                                    if (z) {
                                        arrayList2.add(obj3);
                                    }
                                    i2 = i3;
                                }
                            }
                            z = false;
                            if (z) {
                            }
                            if (z) {
                            }
                            i2 = i3;
                        }
                        return new UIBlockList(uIBlockList, arrayList2);
                    }
                    if (i != 3 && i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sg4 sg4Var = new sg4(7, userId3, stateSubscribeNotification3);
                    for (UIBlock uIBlock2 : uIBlockList.y) {
                        sg4Var.invoke(uIBlockList, uIBlock2);
                        if (uIBlock2 instanceof UIBlockList) {
                            UIBlockList uIBlockList2 = (UIBlockList) uIBlock2;
                            for (UIBlock uIBlock3 : uIBlockList2.y) {
                                sg4Var.invoke(uIBlockList2, uIBlock3);
                                if (uIBlock3 instanceof UIBlockList) {
                                    UIBlockList uIBlockList3 = (UIBlockList) uIBlock3;
                                    for (UIBlock uIBlock4 : uIBlockList3.y) {
                                        sg4Var.invoke(uIBlockList3, uIBlock4);
                                        if (uIBlock4 instanceof UIBlockList) {
                                            UIBlockList uIBlockList4 = (UIBlockList) uIBlock4;
                                            for (UIBlock uIBlock5 : uIBlockList4.y) {
                                                sg4Var.invoke(uIBlockList4, uIBlock5);
                                                if (uIBlock5 instanceof UIBlockList) {
                                                    o19.w((UIBlockList) uIBlock5, sg4Var);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (booleanValue) {
                    ArrayList<UIBlock> arrayList3 = uIBlockList.y;
                    Integer num = j7t0Var2.b;
                    UIBlock uIBlock6 = j7t0Var2.c;
                    if (num != null && uIBlock6 != null) {
                        int intValue = num.intValue();
                        if ((uIBlock6 instanceof UIBlockSearchAuthor) && (b = ((UIBlockSearchAuthor) uIBlock6).y.b()) != null) {
                            b.k0 = VideoNotificationsStatus.PREFERRED.i();
                        }
                        s3q0 s3q0Var = s3q0.a;
                        arrayList3.add(intValue, uIBlock6);
                    }
                    return new UIBlockList(uIBlockList, arrayList3);
                }
                return uIBlockList;
            }
        }), false);
        if (!booleanValue) {
            cVar.A.b(new h.t(stateSubscribeNotification2));
        }
        return s3q0.a;
    }
}
