package xsna;

import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.exceptions.folder.FoldersLimitExceedException;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.Set;
import xsna.otb;
import xsna.s2s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pv2 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pv2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((hb) obj2).invoke(obj);
                break;
            case 1:
                ((tn0) obj2).invoke(obj);
                break;
            case 2:
                ((hb) obj2).invoke(obj);
                break;
            case 3:
                ((hb) obj2).invoke(obj);
                break;
            case 4:
                ((hb) obj2).invoke(obj);
                break;
            case 5:
                int i2 = ChannelFragment.a1;
                ((hb) obj2).invoke(obj);
                break;
            case 6:
                ((hb) obj2).invoke(obj);
                break;
            case 7:
                ((hb) obj2).invoke(obj);
                break;
            case 8:
                ((otb.i) obj2).invoke(obj);
                break;
            case 9:
                ((s8) obj2).invoke(obj);
                break;
            case 10:
                ((zt4) obj2).invoke(obj);
                break;
            case 11:
                ((cxe) obj2).invoke(obj);
                break;
            case 12:
                ((m4g) obj2).invoke(obj);
                break;
            case 13:
                ((laj) obj2).d((Throwable) obj);
                break;
            case 14:
                ((d37) obj2).invoke(obj);
                break;
            case 15:
                ((m4g) obj2).invoke(obj);
                break;
            case 16:
                final i2s i2sVar = (i2s) obj2;
                a1s a1sVar = (a1s) obj;
                c1s c1sVar = i2sVar.h;
                if (!(a1sVar instanceof w480)) {
                    int i3 = 15;
                    if (!(a1sVar instanceof x480)) {
                        if (!(a1sVar instanceof y480)) {
                            if (!(a1sVar instanceof b580)) {
                                if (!(a1sVar instanceof e580)) {
                                    if (!(a1sVar instanceof c580)) {
                                        if (!(a1sVar instanceof d580)) {
                                            if (!(a1sVar instanceof z480)) {
                                                if (!(a1sVar instanceof a580)) {
                                                    if (!(a1sVar instanceof j580)) {
                                                        if (!(a1sVar instanceof h580)) {
                                                            if (!(a1sVar instanceof i580)) {
                                                                if (!(a1sVar instanceof k580)) {
                                                                    if (!(a1sVar instanceof f580)) {
                                                                        if (a1sVar instanceof l580) {
                                                                            c1sVar.a();
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        c1sVar.a();
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i2sVar.r(new e2s(i2sVar, 0));
                                                                    break;
                                                                }
                                                            } else {
                                                                i2sVar.q(new com.vk.movika.sdk.base.utils.b(24));
                                                                break;
                                                            }
                                                        } else {
                                                            i2sVar.q(new r9k(i2sVar, 9));
                                                            break;
                                                        }
                                                    } else {
                                                        i2sVar.q(new uoh(i2sVar, i3));
                                                        break;
                                                    }
                                                } else {
                                                    i2sVar.q(new h2s((a580) a1sVar, i2sVar));
                                                    break;
                                                }
                                            } else {
                                                i2sVar.q(new hl1(i3, (z480) a1sVar, i2sVar));
                                                break;
                                            }
                                        } else {
                                            i2sVar.q(new n3i((d580) a1sVar, i2sVar));
                                            break;
                                        }
                                    } else {
                                        i2sVar.q(new o43(22, (c580) a1sVar, i2sVar));
                                        break;
                                    }
                                } else {
                                    i2sVar.q(new by5(14, i2sVar, (e580) a1sVar));
                                    break;
                                }
                            } else {
                                final int i4 = ((b580) a1sVar).b;
                                i2sVar.q(new izs(i4, i2sVar) { // from class: xsna.g2s
                                    public final /* synthetic */ int b;

                                    @Override // xsna.izs
                                    public final Object invoke(Object obj3) {
                                        t2s t2sVar = (t2s) obj3;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(t2sVar.c);
                                        int i5 = this.b;
                                        linkedHashMap.remove(Integer.valueOf(i5));
                                        Set R0 = j5g.R0(t2sVar.g);
                                        R0.remove(Integer.valueOf(i5));
                                        return i2s.u(t2s.a(t2sVar, i2s.s(linkedHashMap, t2sVar.d), false, linkedHashMap, null, false, null, R0, false, 0, 442));
                                    }
                                });
                                break;
                            }
                        } else {
                            i2sVar.q(new qm0(i2sVar, 20));
                            break;
                        }
                    } else {
                        x480 x480Var = (x480) a1sVar;
                        if (x480Var.c instanceof FoldersLimitExceedException) {
                            i2sVar.n(new s2s.c(R.string.vkim_folder_limit_reached, 15));
                        } else {
                            i2sVar.n(new s2s.c(R.string.vkim_folder_create_failed, x480Var.b));
                        }
                        i2sVar.q(new j5n(i2sVar));
                        break;
                    }
                } else {
                    i2sVar.q(new i4h(i2sVar, 21));
                    break;
                }
                break;
            case 17:
                int i5 = FriendsImportFragment.a0;
                ((d37) obj2).invoke(obj);
                break;
            case 18:
                int i6 = vnt.n1;
                ((m4g) obj2).invoke(obj);
                break;
            case 19:
                int i7 = GroupedNotificationsFragment.f0;
                ((ll1) obj2).invoke(obj);
                break;
            case 20:
                ((m4g) obj2).invoke(obj);
                break;
            case 21:
                ((ll1) obj2).invoke(obj);
                break;
            case 22:
                ((m4g) obj2).invoke(obj);
                break;
            case 23:
                ((j4x) obj2).invoke(obj);
                break;
            case 24:
                ((j4x) obj2).invoke(obj);
                break;
            case 25:
                ((j4x) obj2).invoke(obj);
                break;
            case 26:
                ((j4x) obj2).invoke(obj);
                break;
            case 27:
                int i8 = MoneyTransferPagerFragment.w0;
                ((j4x) obj2).invoke(obj);
                break;
            case 28:
                ((j4x) obj2).invoke(obj);
                break;
            default:
                ((j4x) obj2).invoke(obj);
                break;
        }
    }
}
