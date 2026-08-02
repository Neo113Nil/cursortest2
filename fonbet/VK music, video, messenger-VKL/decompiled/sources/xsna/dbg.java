package xsna;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vk.dto.badges.BadgeItem;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: CommentDisplayItemsBuilder.kt */
/* loaded from: classes4.dex */
public final class dbg {
    public bbg a = new bbg(true, false);
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;

    public static ArrayList a(dbg dbgVar, NewsComment newsComment, boolean z, WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder, int i) {
        if ((i & 8) != 0) {
            wallNegativeRepliesPlaceholder = null;
        }
        dbgVar.getClass();
        return dbgVar.d(Collections.singletonList(newsComment), z, false, wallNegativeRepliesPlaceholder);
    }

    public static /* synthetic */ ArrayList c(dbg dbgVar, NewsComment newsComment, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        dbgVar.b(newsComment, list, arrayList);
        return arrayList;
    }

    public static void f(dbg dbgVar, NewsComment newsComment, WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder, ArrayList arrayList) {
        cbg cbgVar;
        dbgVar.getClass();
        int i = 443;
        if (wallNegativeRepliesPlaceholder != null) {
            cbgVar = new s060(newsComment, wallNegativeRepliesPlaceholder, 443);
            cbgVar.e = dbgVar.a;
        } else {
            cbgVar = new cbg(newsComment, i, 2);
            cbgVar.e = dbgVar.a;
        }
        arrayList.add(cbgVar);
    }

    public final void b(NewsComment newsComment, List list, ArrayList arrayList) {
        int g = g();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cbg cbgVar = new cbg((NewsComment) list.get(i), newsComment, g);
            cbgVar.e = this.a;
            arrayList.add(cbgVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x00f2, code lost:
    
        if (xsna.t11.d() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00f4, code lost:
    
        r8 = 436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00f6, code lost:
    
        r8 = 434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x013a, code lost:
    
        if (xsna.t11.d() != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(List list, boolean z, boolean z2, WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder) {
        int i;
        CommentThread commentThread;
        String str;
        String str2;
        ?? r12;
        Integer num;
        ArrayList arrayList = new ArrayList(list.size());
        this.a = new bbg(this.a.a, this.j == 0);
        boolean z3 = list.isEmpty() && z;
        int i2 = this.j;
        if (i2 != 0 ? z3 && ((this.e || this.i) && this.h) : wallNegativeRepliesPlaceholder == null && z3 && this.h) {
            iag iagVar = null;
            if (z2) {
                num = 441;
            } else {
                boolean z4 = this.d;
                if (z4 && this.c) {
                    num = Integer.valueOf(i2 == 0 ? 450 : this.i ? t11.d() ? 431 : 430 : 428);
                } else if (z4) {
                    num = Integer.valueOf(i2 == 0 ? 451 : this.i ? Tensorflow.FRAME_WIDTH : CommonGatewayClient.CODE_TOO_MANY_REQUESTS);
                } else {
                    num = null;
                }
            }
            if (num != null) {
                cbg cbgVar = new cbg(iagVar, num.intValue(), 3);
                cbgVar.e = this.a;
                arrayList.add(cbgVar);
            }
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NewsComment newsComment = (NewsComment) it.next();
            boolean z5 = newsComment.s;
            int i3 = 2;
            if (z5 && !this.f) {
                i = 425;
            } else if (z5 && !this.k) {
                i = 426;
            } else if (z5 && this.k) {
                i = 427;
            } else if (this.e) {
                i = 433;
            } else {
                boolean z6 = this.f;
                if (z6 && !this.k) {
                    if (!this.g) {
                    }
                    i = 410;
                } else if (z6 && this.k) {
                    i = t11.d() ? 437 : 435;
                } else {
                    BadgeItem badgeItem = newsComment.V;
                    if (badgeItem != null && newsComment.W != null) {
                        i = this.j == 0 ? 449 : 439;
                    } else if (badgeItem != null) {
                        i = this.j == 0 ? 448 : 440;
                    } else {
                        int i4 = this.j;
                        if (i4 == 0) {
                            i = 445;
                        } else {
                            if (i4 == 2 && !this.g) {
                            }
                            i = 410;
                        }
                    }
                }
            }
            cbg cbgVar2 = new cbg(newsComment, i, i3);
            cbgVar2.e = this.a;
            arrayList.add(cbgVar2);
            if (!this.f && !newsComment.v && (commentThread = newsComment.L) != null) {
                List<NewsComment> list2 = commentThread.f;
                if (list2.size() > 0) {
                    int g = g();
                    CommentThread commentThread2 = newsComment.L;
                    if (commentThread2 != null) {
                        List<NewsComment> list3 = commentThread2.f;
                        r12 = new ArrayList(list3.size());
                        int size = list3.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            cbg cbgVar3 = new cbg(list3.get(i5), newsComment, g);
                            cbgVar3.e = this.a;
                            r12.add(cbgVar3);
                        }
                    } else {
                        r12 = EmptyList.b;
                    }
                    arrayList.addAll((Collection) r12);
                }
                if (this.b && (((str2 = commentThread.h) != null && str2.length() != 0) || commentThread.g != null)) {
                    f(this, newsComment, commentThread.g, arrayList);
                }
                if (list2.size() > 0 || (this.b && (((str = commentThread.h) != null && str.length() != 0) || commentThread.g != null))) {
                    if (commentThread.e) {
                        arrayList.add(new cbg(newsComment, 420, i3));
                    }
                }
            }
        }
        e(arrayList, wallNegativeRepliesPlaceholder, z2);
        return arrayList;
    }

    public final void e(ArrayList arrayList, WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder, boolean z) {
        if (z) {
            arrayList.add(new cbg((iag) null, 441, 3));
        } else if (wallNegativeRepliesPlaceholder != null) {
            s060 s060Var = new s060(new NewsComment(), wallNegativeRepliesPlaceholder, 442);
            s060Var.e = this.a;
            arrayList.add(s060Var);
        }
    }

    public final int g() {
        if (this.k) {
            if (this.j == 0) {
                return 447;
            }
            if (this.f) {
                return t11.d() ? 423 : 422;
            }
            return 421;
        }
        if (this.j == 0) {
            return 446;
        }
        if (this.f) {
            return t11.d() ? 419 : 418;
        }
        return 417;
    }
}
