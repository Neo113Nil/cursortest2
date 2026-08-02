package xsna;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.io.IOException;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: Limit.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class ktr implements Continuation {
    public static final /* synthetic */ ktr b = new ktr();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(lsr lsrVar, Object obj, Object obj2, ContinuationImpl continuationImpl) {
        itr itrVar;
        int i;
        if (continuationImpl instanceof itr) {
            itrVar = (itr) continuationImpl;
            int i2 = itrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                itrVar.label = i2 - Integer.MIN_VALUE;
                Object obj3 = itrVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = itrVar.label;
                if (i != 0) {
                    kotlin.a.a(obj3);
                    itrVar.L$0 = obj2;
                    itrVar.label = 1;
                    if (lsrVar.emit(obj, itrVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = itrVar.L$0;
                    kotlin.a.a(obj3);
                }
                throw new AbortFlowException(obj2);
            }
        }
        itrVar = new itr(continuationImpl);
        Object obj32 = itrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = itrVar.label;
        if (i != 0) {
        }
        throw new AbortFlowException(obj2);
    }

    public static io.reactivex.rxjava3.core.q c(io.reactivex.rxjava3.core.q qVar) {
        return new io.reactivex.rxjava3.internal.operators.observable.k1(qVar).L(new yht(new vug0(io.reactivex.rxjava3.android.schedulers.a.b()), 1), false);
    }

    public static io.reactivex.rxjava3.internal.operators.single.r d(io.reactivex.rxjava3.core.x xVar) {
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.z(xVar), new pu50(new wug0(io.reactivex.rxjava3.android.schedulers.a.b(), 0), 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r13 != 337) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r74 b(NewsEntry newsEntry, NewsEntry newsEntry2, Attachment attachment, int i, List list, s1c0 s1c0Var) {
        r74 r74Var;
        r74 r74Var2 = null;
        if (attachment instanceof AlbumAttachment) {
            AlbumAttachment albumAttachment = (AlbumAttachment) attachment;
            if (i == 52) {
                r74Var2 = new r74(52, albumAttachment, newsEntry, newsEntry2);
                r74Var2.h = (ol60) j5g.a0(new ao8(17).u(0, new Triple(newsEntry, newsEntry2, albumAttachment)));
            } else if (i == 111) {
                r74Var2 = new r74(111, albumAttachment, newsEntry, newsEntry2);
                r74Var2.h = (ol60) j5g.a0(new ne7().G(0, new Triple(newsEntry, newsEntry2, albumAttachment)));
            }
        } else if (attachment instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            if (i != 59) {
                if (i == 208) {
                    r74Var = new r74(i, videoAttachment, newsEntry, newsEntry2);
                    r74Var.h = (ol60) j5g.a0(new vgt0().x(new mds0(i, newsEntry, newsEntry2, videoAttachment), null));
                } else if (i == 220) {
                    r74Var2 = bdl.b(i, newsEntry, newsEntry2, videoAttachment);
                } else if (i == 227) {
                    r74Var = new r74(i, videoAttachment, newsEntry, newsEntry2);
                    r74Var.h = (ol60) j5g.a0(new m3a(2).x(new mds0(i, newsEntry, newsEntry2, videoAttachment), null));
                } else if (i != 231) {
                    if (i != 299 && i != 303) {
                        if (i != 353) {
                            if (i != 336) {
                            }
                        }
                    }
                    r74Var = new r74(i, videoAttachment, newsEntry, newsEntry2);
                    r74Var.h = (ol60) j5g.a0(new dfd().x(new mds0(i, newsEntry, newsEntry2, videoAttachment), null));
                } else {
                    r74Var = new r74(i, videoAttachment, newsEntry, newsEntry2);
                    r74Var.h = (ol60) j5g.a0(new com.vk.channels.impl.channel_screen.send_msg.c(1).x(new mds0(i, newsEntry, newsEntry2, videoAttachment), null));
                }
                r74Var2 = r74Var;
            }
            r74Var2 = new r74(i, videoAttachment, newsEntry, newsEntry2);
            r74Var2.h = (ol60) j5g.a0(new dd80(9).j(new p3s0(newsEntry, newsEntry2, videoAttachment, i, s1c0Var)));
        } else if (attachment instanceof MarketAlbumAttachment) {
            if (i == 53) {
                r74Var2 = new r74(i, attachment, newsEntry, newsEntry2);
            }
        } else if (attachment instanceof DocumentAttachment) {
            DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
            if (i == 7) {
                r74Var2 = wuj.b(newsEntry, newsEntry2, documentAttachment, i);
            } else if (i == 11) {
                r74Var2 = wuj.c(newsEntry, newsEntry2, documentAttachment, i);
            }
        } else if (attachment instanceof PhotoAttachment) {
            vp10 vp10Var = new vp10(newsEntry, newsEntry2, (PhotoAttachment) attachment, i, 0, list, s1c0Var.d());
            int d = vp10Var.d();
            if (d == 50) {
                r74Var2 = a6a0.c(vp10Var);
            } else if (d == 109) {
                r74Var2 = a6a0.a(vp10Var);
            } else if (d == 110) {
                r74Var2 = a6a0.b(vp10Var);
            }
        }
        return r74Var2 == null ? new r74(i, attachment, newsEntry, newsEntry2) : r74Var2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.getException()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
