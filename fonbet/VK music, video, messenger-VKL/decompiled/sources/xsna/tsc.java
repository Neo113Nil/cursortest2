package xsna;

import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCoOwnerDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoInfoDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoOrdInfoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkCoverImage;
import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.dto.common.id.UserId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: ClipEditSdkInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class tsc {
    public final wtc a;

    public tsc(wtc wtcVar) {
        this.a = wtcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca A[Catch: all -> 0x0027, CancellationException -> 0x002b, TimeoutCancellationException -> 0x002f, TRY_LEAVE, TryCatch #2 {TimeoutCancellationException -> 0x002f, CancellationException -> 0x002b, all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0049, B:14:0x005b, B:18:0x0066, B:20:0x008a, B:23:0x00b1, B:25:0x00ca, B:29:0x0095, B:30:0x009c, B:33:0x00ab, B:37:0x00c1, B:38:0x00c6, B:43:0x003e), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        nsc nscVar;
        int i;
        Integer s1;
        String title;
        e2s0 e2s0Var;
        try {
            if (continuationImpl instanceof nsc) {
                nscVar = (nsc) continuationImpl;
                int i2 = nscVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nscVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = nscVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = nscVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        wtc wtcVar = this.a;
                        nscVar.label = 1;
                        obj = wtcVar.e(str, nscVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) obj;
                    s1 = videoVideoFullDto.s1();
                    UserId q = videoVideoFullDto.q();
                    title = videoVideoFullDto.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String str2 = title;
                    List<VideoVideoImageDto> t1 = videoVideoFullDto.t1();
                    if (s1 != null || q == null || t1 == null) {
                        e2s0Var = null;
                    } else {
                        int intValue = s1.intValue();
                        StringBuilder sb = new StringBuilder();
                        sb.append(q);
                        sb.append('_');
                        sb.append(intValue);
                        String sb2 = sb.toString();
                        Iterator<T> it = t1.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int width = ((VideoVideoImageDto) next).getWidth();
                            do {
                                Object next2 = it.next();
                                int width2 = ((VideoVideoImageDto) next2).getWidth();
                                if (width > width2) {
                                    next = next2;
                                    width = width2;
                                }
                            } while (it.hasNext());
                        }
                        e2s0Var = new e2s0(q, sb2, str2, ((VideoVideoImageDto) next).getUrl(), videoVideoFullDto.l());
                    }
                    return e2s0Var != null ? new Result.Failure(new IllegalStateException("Backend returned wrong attached video data")) : e2s0Var;
                }
            }
            if (i != 0) {
            }
            VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) obj;
            s1 = videoVideoFullDto2.s1();
            UserId q2 = videoVideoFullDto2.q();
            title = videoVideoFullDto2.getTitle();
            if (title == null) {
            }
            String str22 = title;
            List<VideoVideoImageDto> t12 = videoVideoFullDto2.t1();
            if (s1 != null) {
            }
            e2s0Var = null;
            if (e2s0Var != null) {
            }
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        nscVar = new nsc(this, continuationImpl);
        Object obj2 = nscVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nscVar.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        if (r9 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[Catch: all -> 0x002d, CancellationException -> 0x0030, TimeoutCancellationException -> 0x0033, TryCatch #2 {TimeoutCancellationException -> 0x0033, CancellationException -> 0x0030, all -> 0x002d, blocks: (B:12:0x0029, B:13:0x008e, B:14:0x009a, B:20:0x003e, B:21:0x0070, B:23:0x0074, B:24:0x007a, B:29:0x0042, B:30:0x0056, B:33:0x004d, B:37:0x005d, B:39:0x0063, B:42:0x0081), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(UserId userId, UserId userId2, ContinuationImpl continuationImpl) {
        osc oscVar;
        int i;
        GroupsGroupFullDto groupsGroupFullDto;
        try {
            if (continuationImpl instanceof osc) {
                oscVar = (osc) continuationImpl;
                int i2 = oscVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oscVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = oscVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = oscVar.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        wtc wtcVar = this.a;
                        if (userId2 != null) {
                            oscVar.label = 1;
                            obj = wtcVar.a(userId2, oscVar);
                            if (obj == coroutineSingletons) {
                            }
                            z = ((Boolean) obj).booleanValue();
                        } else if (fkq0.b(userId)) {
                            UserId a = fkq0.a(userId);
                            oscVar.label = 2;
                            obj = wtcVar.b(a, oscVar);
                            if (obj == coroutineSingletons) {
                            }
                            groupsGroupFullDto = (GroupsGroupFullDto) obj;
                            if ((groupsGroupFullDto == null ? groupsGroupFullDto.u3() : null) != GroupsGroupIsClosedDto.OPEN) {
                            }
                        } else {
                            UserId a2 = fkq0.a(userId);
                            oscVar.label = 3;
                            obj = wtcVar.d(a2, oscVar);
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        kotlin.a.a(obj);
                        z = ((Boolean) obj).booleanValue();
                    } else if (i == 2) {
                        kotlin.a.a(obj);
                        groupsGroupFullDto = (GroupsGroupFullDto) obj;
                        if ((groupsGroupFullDto == null ? groupsGroupFullDto.u3() : null) != GroupsGroupIsClosedDto.OPEN) {
                            z = false;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        z = epx.f(((UsersUserFullDto) obj).T2(), Boolean.TRUE);
                    }
                    return Boolean.valueOf(z);
                }
            }
            if (i != 0) {
            }
            return Boolean.valueOf(z);
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        oscVar = new osc(this, continuationImpl);
        Object obj2 = oscVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oscVar.label;
        boolean z2 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        psc pscVar;
        int i;
        try {
            if (continuationImpl instanceof psc) {
                pscVar = (psc) continuationImpl;
                int i2 = pscVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pscVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = pscVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pscVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        wtc wtcVar = this.a;
                        pscVar.label = 1;
                        obj = wtcVar.c(pscVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return (List) obj;
                }
            }
            if (i != 0) {
            }
            return (List) obj;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        pscVar = new psc(this, continuationImpl);
        Object obj2 = pscVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pscVar.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r9.h(r7, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(UserId userId, UserId userId2, ContinuationImpl continuationImpl) {
        qsc qscVar;
        int i;
        try {
            if (continuationImpl instanceof qsc) {
                qscVar = (qsc) continuationImpl;
                int i2 = qscVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qscVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = qscVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = qscVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        wtc wtcVar = this.a;
                        if (userId2 != null) {
                            qscVar.label = 1;
                            if (wtcVar.f(userId2, qscVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (fkq0.b(userId)) {
                            UserId a = fkq0.a(userId);
                            qscVar.label = 2;
                            if (wtcVar.g(a, qscVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            UserId a2 = fkq0.a(userId);
                            qscVar.label = 3;
                        }
                    } else {
                        if (i != 1 && i != 2 && i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return Boolean.TRUE;
                }
            }
            if (i != 0) {
            }
            return Boolean.TRUE;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        qscVar = new qsc(this, continuationImpl);
        Object obj2 = qscVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qscVar.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[Catch: all -> 0x0035, CancellationException -> 0x0038, TimeoutCancellationException -> 0x003b, TryCatch #2 {TimeoutCancellationException -> 0x003b, CancellationException -> 0x0038, all -> 0x0035, blocks: (B:12:0x0030, B:14:0x008a, B:16:0x008e, B:18:0x0094, B:20:0x009c, B:22:0x00a4, B:24:0x00aa, B:26:0x00b0, B:28:0x00b6, B:29:0x00ba, B:31:0x00c6, B:33:0x00cc, B:37:0x00dc, B:39:0x00e8, B:42:0x00ed, B:45:0x00f2, B:47:0x00fe, B:49:0x0104, B:51:0x010a, B:52:0x0115, B:54:0x011b, B:55:0x0129, B:57:0x012f, B:61:0x0144, B:66:0x0175, B:70:0x014a, B:73:0x0164, B:81:0x017c, B:82:0x017e, B:97:0x0049, B:99:0x0053, B:100:0x005a, B:101:0x006d, B:103:0x0073, B:105:0x007f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[Catch: all -> 0x0035, CancellationException -> 0x0038, TimeoutCancellationException -> 0x003b, TryCatch #2 {TimeoutCancellationException -> 0x003b, CancellationException -> 0x0038, all -> 0x0035, blocks: (B:12:0x0030, B:14:0x008a, B:16:0x008e, B:18:0x0094, B:20:0x009c, B:22:0x00a4, B:24:0x00aa, B:26:0x00b0, B:28:0x00b6, B:29:0x00ba, B:31:0x00c6, B:33:0x00cc, B:37:0x00dc, B:39:0x00e8, B:42:0x00ed, B:45:0x00f2, B:47:0x00fe, B:49:0x0104, B:51:0x010a, B:52:0x0115, B:54:0x011b, B:55:0x0129, B:57:0x012f, B:61:0x0144, B:66:0x0175, B:70:0x014a, B:73:0x0164, B:81:0x017c, B:82:0x017e, B:97:0x0049, B:99:0x0053, B:100:0x005a, B:101:0x006d, B:103:0x0073, B:105:0x007f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[Catch: all -> 0x0035, CancellationException -> 0x0038, TimeoutCancellationException -> 0x003b, TryCatch #2 {TimeoutCancellationException -> 0x003b, CancellationException -> 0x0038, all -> 0x0035, blocks: (B:12:0x0030, B:14:0x008a, B:16:0x008e, B:18:0x0094, B:20:0x009c, B:22:0x00a4, B:24:0x00aa, B:26:0x00b0, B:28:0x00b6, B:29:0x00ba, B:31:0x00c6, B:33:0x00cc, B:37:0x00dc, B:39:0x00e8, B:42:0x00ed, B:45:0x00f2, B:47:0x00fe, B:49:0x0104, B:51:0x010a, B:52:0x0115, B:54:0x011b, B:55:0x0129, B:57:0x012f, B:61:0x0144, B:66:0x0175, B:70:0x014a, B:73:0x0164, B:81:0x017c, B:82:0x017e, B:97:0x0049, B:99:0x0053, B:100:0x005a, B:101:0x006d, B:103:0x0073, B:105:0x007f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[Catch: all -> 0x0035, CancellationException -> 0x0038, TimeoutCancellationException -> 0x003b, TryCatch #2 {TimeoutCancellationException -> 0x003b, CancellationException -> 0x0038, all -> 0x0035, blocks: (B:12:0x0030, B:14:0x008a, B:16:0x008e, B:18:0x0094, B:20:0x009c, B:22:0x00a4, B:24:0x00aa, B:26:0x00b0, B:28:0x00b6, B:29:0x00ba, B:31:0x00c6, B:33:0x00cc, B:37:0x00dc, B:39:0x00e8, B:42:0x00ed, B:45:0x00f2, B:47:0x00fe, B:49:0x0104, B:51:0x010a, B:52:0x0115, B:54:0x011b, B:55:0x0129, B:57:0x012f, B:61:0x0144, B:66:0x0175, B:70:0x014a, B:73:0x0164, B:81:0x017c, B:82:0x017e, B:97:0x0049, B:99:0x0053, B:100:0x005a, B:101:0x006d, B:103:0x0073, B:105:0x007f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2 A[Catch: all -> 0x0035, CancellationException -> 0x0038, TimeoutCancellationException -> 0x003b, TryCatch #2 {TimeoutCancellationException -> 0x003b, CancellationException -> 0x0038, all -> 0x0035, blocks: (B:12:0x0030, B:14:0x008a, B:16:0x008e, B:18:0x0094, B:20:0x009c, B:22:0x00a4, B:24:0x00aa, B:26:0x00b0, B:28:0x00b6, B:29:0x00ba, B:31:0x00c6, B:33:0x00cc, B:37:0x00dc, B:39:0x00e8, B:42:0x00ed, B:45:0x00f2, B:47:0x00fe, B:49:0x0104, B:51:0x010a, B:52:0x0115, B:54:0x011b, B:55:0x0129, B:57:0x012f, B:61:0x0144, B:66:0x0175, B:70:0x014a, B:73:0x0164, B:81:0x017c, B:82:0x017e, B:97:0x0049, B:99:0x0053, B:100:0x005a, B:101:0x006d, B:103:0x0073, B:105:0x007f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe A[Catch: all -> 0x0035, CancellationException -> 0x0038, TimeoutCancellationException -> 0x003b, TryCatch #2 {TimeoutCancellationException -> 0x003b, CancellationException -> 0x0038, all -> 0x0035, blocks: (B:12:0x0030, B:14:0x008a, B:16:0x008e, B:18:0x0094, B:20:0x009c, B:22:0x00a4, B:24:0x00aa, B:26:0x00b0, B:28:0x00b6, B:29:0x00ba, B:31:0x00c6, B:33:0x00cc, B:37:0x00dc, B:39:0x00e8, B:42:0x00ed, B:45:0x00f2, B:47:0x00fe, B:49:0x0104, B:51:0x010a, B:52:0x0115, B:54:0x011b, B:55:0x0129, B:57:0x012f, B:61:0x0144, B:66:0x0175, B:70:0x014a, B:73:0x0164, B:81:0x017c, B:82:0x017e, B:97:0x0049, B:99:0x0053, B:100:0x005a, B:101:0x006d, B:103:0x0073, B:105:0x007f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b A[Catch: all -> 0x0035, CancellationException -> 0x0038, TimeoutCancellationException -> 0x003b, TryCatch #2 {TimeoutCancellationException -> 0x003b, CancellationException -> 0x0038, all -> 0x0035, blocks: (B:12:0x0030, B:14:0x008a, B:16:0x008e, B:18:0x0094, B:20:0x009c, B:22:0x00a4, B:24:0x00aa, B:26:0x00b0, B:28:0x00b6, B:29:0x00ba, B:31:0x00c6, B:33:0x00cc, B:37:0x00dc, B:39:0x00e8, B:42:0x00ed, B:45:0x00f2, B:47:0x00fe, B:49:0x0104, B:51:0x010a, B:52:0x0115, B:54:0x011b, B:55:0x0129, B:57:0x012f, B:61:0x0144, B:66:0x0175, B:70:0x014a, B:73:0x0164, B:81:0x017c, B:82:0x017e, B:97:0x0049, B:99:0x0053, B:100:0x005a, B:101:0x006d, B:103:0x0073, B:105:0x007f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c A[Catch: all -> 0x0035, CancellationException -> 0x0038, TimeoutCancellationException -> 0x003b, TryCatch #2 {TimeoutCancellationException -> 0x003b, CancellationException -> 0x0038, all -> 0x0035, blocks: (B:12:0x0030, B:14:0x008a, B:16:0x008e, B:18:0x0094, B:20:0x009c, B:22:0x00a4, B:24:0x00aa, B:26:0x00b0, B:28:0x00b6, B:29:0x00ba, B:31:0x00c6, B:33:0x00cc, B:37:0x00dc, B:39:0x00e8, B:42:0x00ed, B:45:0x00f2, B:47:0x00fe, B:49:0x0104, B:51:0x010a, B:52:0x0115, B:54:0x011b, B:55:0x0129, B:57:0x012f, B:61:0x0144, B:66:0x0175, B:70:0x014a, B:73:0x0164, B:81:0x017c, B:82:0x017e, B:97:0x0049, B:99:0x0053, B:100:0x005a, B:101:0x006d, B:103:0x0073, B:105:0x007f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ImmutableClipState immutableClipState, ContinuationImpl continuationImpl) {
        rsc rscVar;
        int i;
        EmptyList emptyList;
        VideoVideoFullDto videoVideoFullDto;
        ClipEditSdkCoverImage s;
        String description;
        SdkClipOrdData sdkClipOrdData;
        SdkActionLink sdkActionLink;
        ShortVideoShortVideoInfoDto I2;
        List<ShortVideoCoOwnerDto> l;
        Object obj;
        ActionLinksActionDto f;
        VideoOrdInfoDto W1;
        List<VideoVideoImageDto> t1;
        ImmutableClipState immutableClipState2 = immutableClipState;
        try {
            if (continuationImpl instanceof rsc) {
                rscVar = (rsc) continuationImpl;
                int i2 = rscVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rscVar.label = i2 - Integer.MIN_VALUE;
                    rsc rscVar2 = rscVar;
                    Object obj2 = rscVar2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = rscVar2.label;
                    emptyList = null;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        wtc wtcVar = this.a;
                        String str = immutableClipState2.e;
                        SdkClipOrdData sdkClipOrdData2 = immutableClipState2.k;
                        ImmutableClipState.AttachedVideo attachedVideo = immutableClipState2.l;
                        String id = attachedVideo != null ? attachedVideo.getId() : null;
                        List<ClipCoauthorSdkItem> list = immutableClipState2.m;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ClipCoauthorSdkItem) it.next()).b);
                        }
                        rscVar2.L$0 = immutableClipState2;
                        rscVar2.label = 1;
                        obj2 = wtcVar.i(str, sdkClipOrdData2, id, arrayList, rscVar2);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        immutableClipState2 = (ImmutableClipState) rscVar2.L$0;
                        kotlin.a.a(obj2);
                    }
                    ImmutableClipState immutableClipState3 = immutableClipState2;
                    videoVideoFullDto = (VideoVideoFullDto) obj2;
                    s = (videoVideoFullDto != null || (t1 = videoVideoFullDto.t1()) == null) ? null : egi.s(t1);
                    description = videoVideoFullDto == null ? videoVideoFullDto.getDescription() : null;
                    if (videoVideoFullDto != null || (W1 = videoVideoFullDto.W1()) == null) {
                        sdkClipOrdData = null;
                    } else {
                        SdkClipOrdData sdkClipOrdData3 = immutableClipState3.k;
                        sdkClipOrdData = new SdkClipOrdData(true, sdkClipOrdData3 != null ? sdkClipOrdData3.c : null, sdkClipOrdData3 != null ? sdkClipOrdData3.d : null, W1.getTitle());
                    }
                    if (videoVideoFullDto != null && (f = videoVideoFullDto.f()) != null) {
                        if (epx.f(f.getType(), "video")) {
                            f = null;
                        }
                        if (f != null) {
                            sdkActionLink = (SdkActionLink) b20.b.invoke(f);
                            if (s == null) {
                                s = immutableClipState3.f;
                            }
                            ClipEditSdkCoverImage clipEditSdkCoverImage = s;
                            if (description == null) {
                                description = immutableClipState3.e;
                            }
                            String str2 = description;
                            ImmutableClipState.AttachedVideo.Full full = sdkActionLink != null ? new ImmutableClipState.AttachedVideo.Full(sdkActionLink) : null;
                            if (videoVideoFullDto != null && (I2 = videoVideoFullDto.I2()) != null && (l = I2.l()) != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (ShortVideoCoOwnerDto shortVideoCoOwnerDto : l) {
                                    Iterator<T> it2 = immutableClipState3.m.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it2.next();
                                        if (((ClipCoauthorSdkItem) obj).b.equals(shortVideoCoOwnerDto.q())) {
                                            break;
                                        }
                                    }
                                    ClipCoauthorSdkItem clipCoauthorSdkItem = (ClipCoauthorSdkItem) obj;
                                    ClipCoauthorSdkItem clipCoauthorSdkItem2 = clipCoauthorSdkItem == null ? null : new ClipCoauthorSdkItem(shortVideoCoOwnerDto.q(), clipCoauthorSdkItem.c, clipCoauthorSdkItem.d, clipCoauthorSdkItem.e, shortVideoCoOwnerDto.f() == ShortVideoCoOwnerDto.StatusDto.APPROVED, shortVideoCoOwnerDto.d());
                                    if (clipCoauthorSdkItem2 != null) {
                                        arrayList2.add(clipCoauthorSdkItem2);
                                    }
                                }
                                emptyList = arrayList2;
                            }
                            if (emptyList == null) {
                                emptyList = EmptyList.b;
                            }
                            return ImmutableClipState.a(immutableClipState3, str2, clipEditSdkCoverImage, sdkClipOrdData, full, emptyList, 4583);
                        }
                    }
                    sdkActionLink = null;
                    if (s == null) {
                    }
                    ClipEditSdkCoverImage clipEditSdkCoverImage2 = s;
                    if (description == null) {
                    }
                    String str22 = description;
                    if (sdkActionLink != null) {
                    }
                    if (videoVideoFullDto != null) {
                        ArrayList arrayList22 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        emptyList = arrayList22;
                    }
                    if (emptyList == null) {
                    }
                    return ImmutableClipState.a(immutableClipState3, str22, clipEditSdkCoverImage2, sdkClipOrdData, full, emptyList, 4583);
                }
            }
            if (i != 0) {
            }
            ImmutableClipState immutableClipState32 = immutableClipState2;
            videoVideoFullDto = (VideoVideoFullDto) obj2;
            if (videoVideoFullDto != null) {
            }
            if (videoVideoFullDto == null) {
            }
            if (videoVideoFullDto != null) {
            }
            sdkClipOrdData = null;
            if (videoVideoFullDto != null) {
                if (epx.f(f.getType(), "video")) {
                }
                if (f != null) {
                }
            }
            sdkActionLink = null;
            if (s == null) {
            }
            ClipEditSdkCoverImage clipEditSdkCoverImage22 = s;
            if (description == null) {
            }
            String str222 = description;
            if (sdkActionLink != null) {
            }
            if (videoVideoFullDto != null) {
            }
            if (emptyList == null) {
            }
            return ImmutableClipState.a(immutableClipState32, str222, clipEditSdkCoverImage22, sdkClipOrdData, full, emptyList, 4583);
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        rscVar = new rsc(this, continuationImpl);
        rsc rscVar22 = rscVar;
        Object obj22 = rscVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rscVar22.label;
        emptyList = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        ssc sscVar;
        int i;
        try {
            if (continuationImpl instanceof ssc) {
                sscVar = (ssc) continuationImpl;
                int i2 = sscVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sscVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = sscVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sscVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (str.length() == 0) {
                            s3q0 s3q0Var = s3q0.a;
                            return s3q0.a;
                        }
                        wtc wtcVar = this.a;
                        sscVar.label = 1;
                        if (wtcVar.j(str, sscVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            s3q0 s3q0Var22 = s3q0.a;
            return s3q0.a;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        sscVar = new ssc(this, continuationImpl);
        Object obj2 = sscVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sscVar.label;
    }
}
