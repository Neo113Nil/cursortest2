package xsna;

import androidx.compose.runtime.a;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButtonHints;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: ActionButtonsEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class yx {
    public static final void a(List list, ActionButtonHints actionButtonHints, ActionButton actionButton, izs izsVar, ActionsAvailabilityState.AttachmentState attachmentState, String str, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> rxVar;
        PostingAction.Hints hints;
        rzy rzyVar;
        String str2;
        gzs gzsVar;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto;
        String f;
        Object oxVar;
        ActionButton actionButton2;
        ActionButton actionButton3;
        String str3 = str;
        ActionsAvailabilityState.Availability availability = attachmentState.b;
        androidx.compose.runtime.a M = aVar.M(-2055185092);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(actionButtonHints) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(actionButton) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? M.J(attachmentState) : M.y(attachmentState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(str3) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2055185092, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.ActionButtonsEntryPointCell (ActionButtonsEntryPointCell.kt:33)");
            }
            if (list.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    rxVar = new nx(list, actionButtonHints, actionButton, izsVar, attachmentState, str3, i, 0);
                    s.d = rxVar;
                }
                return;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new bd8();
                M.R(x);
            }
            final yc8 yc8Var = (yc8) x;
            boolean z = availability instanceof ActionsAvailabilityState.Availability.Available;
            float f2 = z ? 1.0f : 0.5f;
            int i3 = i2 >> 3;
            int i4 = i3 & 8078;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-692157245, i4, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.getLeftContent (ActionButtonsEntryPointCell.kt:150)");
            }
            if (actionButtonHints == null) {
                rzyVar = new rzy(null, null);
            } else {
                String str4 = actionButtonHints.b;
                if (str4 != null) {
                    hints = PostingAction.Hints.RemoveDonutOnboardingHint.b;
                } else {
                    str4 = actionButtonHints.c;
                    if (str4 == null || !z) {
                        str4 = actionButtonHints.d;
                        if (str4 != null) {
                            hints = PostingAction.Hints.RemoveVkTicketOnboardingHint.b;
                        } else {
                            hints = null;
                            str4 = null;
                        }
                    } else {
                        hints = PostingAction.Hints.RemoveProductsActionOnboardingHint.b;
                    }
                }
                rzyVar = new rzy(str4, hints);
            }
            qzu0.a.getClass();
            lg90 b0 = qzu0.b0(M);
            final String str5 = rzyVar.a;
            jai c = kai.c(-1765771993, new yzs() { // from class: xsna.sx
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    etv0 etv0Var = (etv0) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1765771993, intValue, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.getLeftContent.<anonymous> (ActionButtonsEntryPointCell.kt:158)");
                    }
                    yc8 yc8Var2 = yc8Var;
                    boolean y = aVar3.y(yc8Var2) | aVar3.y(etv0Var);
                    Object x2 = aVar3.x();
                    if (y || x2 == a.C0011a.a) {
                        x2 = new xx(yc8Var2, etv0Var, null);
                        aVar3.R(x2);
                    }
                    bap.g(str5, (wzs) x2, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M);
            PostingAction postingAction = rzyVar.b;
            boolean y = ((((i3 & 896) ^ 384) > 256 && M.J(izsVar)) || (i3 & 384) == 256) | M.y(postingAction);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new tx(0, (Object) postingAction, (Object) izsVar);
                M.R(x2);
            }
            o00 o00Var = new o00(b0, str5, c, (gzs) x2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int size = list.size();
            q630 q630Var = q630.a.a;
            if (size == 1) {
                M.K(-1259473939);
                ActionButton actionButton4 = (ActionButton) j5g.Y(new wow(list));
                if (actionButton4.f == ActionButton.Type.VkTicket) {
                    M.K(-1259399260);
                    b(o00Var, actionButton, actionButton4, attachmentState, yc8Var, f2, izsVar, str, M, (i3 & 7280) | ((i2 << 9) & 3670016) | (29360128 & (i2 << 6)));
                    str3 = str;
                    aVar2 = M;
                    aVar2.j();
                } else {
                    float f3 = f2;
                    aVar2 = M;
                    str3 = str;
                    aVar2.K(-1258958068);
                    boolean J = ((i2 & 896) == 256) | aVar2.J(actionButton4) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384 || ((i2 & 32768) != 0 && aVar2.y(attachmentState)));
                    Object x3 = aVar2.x();
                    if (J || x3 == c0012a) {
                        actionButton2 = actionButton;
                        oxVar = new ox(0, attachmentState, actionButton2, actionButton4, izsVar);
                        actionButton3 = actionButton4;
                        aVar2.R(oxVar);
                    } else {
                        actionButton2 = actionButton;
                        oxVar = x3;
                        actionButton3 = actionButton4;
                    }
                    gzs gzsVar2 = (gzs) oxVar;
                    String O = d370.O(R.string.action_button_title_button_pattern, new Object[]{actionButton3.d}, aVar2);
                    String str6 = actionButton3.e;
                    boolean z2 = actionButton2 != null;
                    if (str3 != null) {
                        q630Var = ahn.E(q630Var, str3);
                    }
                    woc0.a(o00Var, O, str6, z2, gzsVar2, o19.a(fo50.s(q630Var, yc8Var), f3), "ActionButtonSwitcher", aVar2, 1572864);
                    aVar2.j();
                }
                aVar2.j();
            } else {
                float f4 = f2;
                aVar2 = M;
                str3 = str;
                aVar2.K(-1257876416);
                String N = d370.N(R.string.action_button_title_default, 0, aVar2);
                if (actionButton != null) {
                    ActionButton.Type type = actionButton.f;
                    str2 = actionButton.d;
                    if (type == ActionButton.Type.VkTicket && (wallActionButtonVkTicketDto = actionButton.c) != null && (f = his0.f(wallActionButtonVkTicketDto)) != null) {
                        str2 = f;
                    }
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = zq.a(aVar2, 652165843, R.string.action_button_subtitle_default, aVar2, 0);
                } else {
                    aVar2.K(652164231);
                    aVar2.j();
                }
                String str7 = str2;
                if (actionButton == null) {
                    aVar2.K(-1257391484);
                    aVar2.j();
                    gzsVar = null;
                } else {
                    aVar2.K(-1257391483);
                    boolean z3 = (i2 & 7168) == 2048;
                    Object x4 = aVar2.x();
                    if (z3 || x4 == c0012a) {
                        x4 = new px(izsVar, 0);
                        aVar2.R(x4);
                    }
                    aVar2.j();
                    gzsVar = (gzs) x4;
                }
                String N2 = d370.N(R.string.posting_step2_action_button_accessibility_remove, 0, aVar2);
                if (str3 != null) {
                    q630Var = ahn.E(q630Var, str3);
                }
                q630 a = o19.a(fo50.s(q630Var, yc8Var), f4);
                boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384 || ((i2 & 32768) != 0 && aVar2.y(attachmentState))) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
                Object x5 = aVar2.x();
                if (z4 || x5 == c0012a) {
                    qx qxVar = new qx(izsVar, attachmentState, list, actionButton, 0);
                    aVar2.R(qxVar);
                    x5 = qxVar;
                }
                qoc0.b(N, a, o00Var, str7, N2, null, null, null, (gzs) x5, gzsVar, 2, 2, false, aVar2, 0, Tensorflow.FRAME_WIDTH, 8644);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            rxVar = new rx(list, actionButtonHints, actionButton, izsVar, attachmentState, str3, i, 0);
            s.d = rxVar;
        }
    }

    public static final void b(final o00 o00Var, final ActionButton actionButton, final ActionButton actionButton2, final ActionsAvailabilityState.AttachmentState attachmentState, final yc8 yc8Var, final float f, final izs izsVar, final String str, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String str2;
        gzs gzsVar;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto;
        androidx.compose.runtime.a M = aVar.M(-1455918235);
        if ((i & 6) == 0) {
            i2 = (M.J(o00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(actionButton) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(actionButton2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(attachmentState) : M.y(attachmentState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(yc8Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.n(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(izsVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.J(str) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1455918235, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.VkTicketActionButtonCell (ActionButtonsEntryPointCell.kt:125)");
            }
            String O = d370.O(R.string.action_button_title_button_pattern, new Object[]{actionButton2.d}, M);
            if (actionButton == null || (wallActionButtonVkTicketDto = actionButton.c) == null || (str2 = his0.f(wallActionButtonVkTicketDto)) == null) {
                str2 = actionButton2.e;
            }
            String str3 = str2;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (actionButton == null) {
                M.K(1615393915);
                M.j();
                gzsVar = null;
            } else {
                M.K(1615393916);
                boolean z = (i2 & 3670016) == 1048576;
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new ux(izsVar, 0);
                    M.R(x);
                }
                gzsVar = (gzs) x;
                M.j();
            }
            String N = d370.N(R.string.posting_step2_action_button_accessibility_remove, 0, M);
            q630 q630Var = q630.a.a;
            if (str != null) {
                q630Var = ahn.E(q630Var, str);
            }
            q630 a = o19.a(fo50.s(q630Var, yc8Var), f);
            boolean z2 = ((i2 & 3670016) == 1048576) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && M.y(attachmentState))) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new vx(izsVar, attachmentState, actionButton2, 0);
                M.R(x2);
            }
            aVar2 = M;
            qoc0.b(O, a, o00Var, str3, N, null, null, null, (gzs) x2, gzsVar, 2, 2, false, aVar2, (i2 << 9) & 7168, Tensorflow.FRAME_WIDTH, 8644);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yx.b(o00.this, actionButton, actionButton2, attachmentState, yc8Var, f, izsVar, str, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
