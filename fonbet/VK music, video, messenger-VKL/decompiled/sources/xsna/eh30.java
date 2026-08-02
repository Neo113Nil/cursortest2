package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import com.vk.im.engine.exceptions.attach.AttachUploadCancelledException;
import com.vk.im.engine.exceptions.attach.AttachUploadException;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.typing.ComposingType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import xsna.ezi0;

/* compiled from: MsgAttachSingleUploadCmd.kt */
/* loaded from: classes2.dex */
public final class eh30 extends xl6<Attach> {
    public final Set<Peer> b;
    public final Attach c;
    public final AttachUploadingEndpoint d;
    public final boolean e;
    public final Long f;
    public final File g;

    /* compiled from: MsgAttachSingleUploadCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachUploadingEndpoint.values().length];
            try {
                iArr[AttachUploadingEndpoint.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachUploadingEndpoint.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public eh30() {
        throw null;
    }

    public eh30(Set set, Attach attach, AttachUploadingEndpoint attachUploadingEndpoint, Long l, int i) {
        boolean z = (i & 8) == 0;
        l = (i & 16) != 0 ? null : l;
        this.b = set;
        this.c = attach;
        this.d = attachUploadingEndpoint;
        this.e = z;
        this.f = l;
        ftx0 ftx0Var = attach instanceof ftx0 ? (ftx0) attach : null;
        this.g = ftx0Var != null ? ftx0Var.i1() : null;
    }

    public static String h(Attach attach) {
        return attach instanceof AttachImage ? "photo" : attach instanceof AttachVideo ? "video" : attach instanceof AttachDoc ? "doc" : "";
    }

    @Override // xsna.m2w
    public final String a() {
        File file = this.g;
        return lhg.a(file != null ? file.hashCode() : 0, "im-attach-upload-");
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        odq0 v7xVar;
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        if (i == 1) {
            v7xVar = new v7x(w2wVar, 0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Set<Peer> set = this.b;
            if (set.isEmpty()) {
                throw new IllegalStateException("Check failed.");
            }
            v7xVar = new h0b(w2wVar, (Peer) j5g.X(set), this.f);
        }
        otn otnVar = otn.a;
        StringBuilder sb = new StringBuilder("onExecute attach = ");
        Attach attach = this.c;
        sb.append(attach);
        otnVar.a("MsgAttachSingleUploadCmd", sb.toString());
        if (attach.G0() != AttachSyncState.UPLOAD_REQUIRED || !v7xVar.c(attach)) {
            return attach;
        }
        try {
            return i(w2wVar, v7xVar, attach);
        } catch (InterruptedException e) {
            f(w2wVar, attach, AttachSyncState.UPLOAD_REQUIRED);
            throw e;
        } catch (CancellationException e2) {
            f(w2wVar, attach, AttachSyncState.ERROR);
            StringBuilder sb2 = new StringBuilder("Failed to upload attach (");
            sb2.append(qjg.a(attach));
            sb2.append("): \nDocUploadDebugCollector: \n ");
            otn.a.getClass();
            sb2.append(otn.b.toString());
            sb2.append('\n');
            String sb3 = sb2.toString();
            L.e("MsgAttachSingleUploadCmd", sb3);
            throw new AttachUploadCancelledException(sb3, e2);
        } catch (Exception e3) {
            f(w2wVar, attach, AttachSyncState.ERROR);
            if (e3 instanceof VKApiException) {
                String message = ((VKApiException) e3).getMessage();
                if (message != null ? drm0.D(message, "error.flood", false) : false) {
                    w2wVar.S0().L(attach);
                }
            }
            StringBuilder sb4 = new StringBuilder("Failed to upload attach (");
            sb4.append(qjg.a(attach));
            sb4.append("): ");
            sb4.append(qjg.a(e3));
            sb4.append(" \nDocUploadDebugCollector: \n ");
            otn.a.getClass();
            sb4.append(otn.b.toString());
            sb4.append('\n');
            String sb5 = sb4.toString();
            L.e("MsgAttachSingleUploadCmd", sb5);
            throw new AttachUploadException(sb5, e3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh30)) {
            return false;
        }
        eh30 eh30Var = (eh30) obj;
        return epx.f(this.b, eh30Var.b) && epx.f(this.c, eh30Var.c) && this.d == eh30Var.d && this.e == eh30Var.e && epx.f(this.f, eh30Var.f);
    }

    public final void f(w2w w2wVar, Attach attach, AttachSyncState attachSyncState) {
        attach.S2(attachSyncState);
        s3q0 s3q0Var = s3q0.a;
        g(w2wVar, attach);
        bzp S0 = w2wVar.S0();
        Attach attach2 = this.c;
        S0.k(attach2);
        w2wVar.S0().O(attach2);
    }

    public final void g(w2w w2wVar, Attach attach) {
        if (this.d == AttachUploadingEndpoint.CHANNEL) {
            w2wVar.I0().u(new com.vk.movika.sdk.base.logic.interactor.e(attach, 13));
        }
        if (this.e) {
            return;
        }
        w2wVar.I0().o().s0(attach);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
        Long l = this.f;
        return b + (l == null ? 0 : l.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x036c  */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.dh30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Attach i(final w2w w2wVar, odq0 odq0Var, final Attach attach) {
        wx8 wx8Var;
        File i1;
        wx8 wx8Var2;
        String str;
        wx8 c;
        Attach attach2;
        tcq0 upload = w2wVar.I0().upload();
        AttachUploadingEndpoint attachUploadingEndpoint = AttachUploadingEndpoint.CHAT;
        AttachUploadingEndpoint attachUploadingEndpoint2 = this.d;
        if (attachUploadingEndpoint2 == attachUploadingEndpoint) {
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE Checking cache for attach " + attach.xb()});
            }
            l.getClass();
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE tryToFindCachedInfoForAttach: attach=" + attach.xb() + ", type=" + h(attach)});
            }
            boolean z = attach instanceof AttachImage;
            if (z || (attach instanceof AttachDoc) || (attach instanceof AttachVideo)) {
                tcq0 upload2 = w2wVar.I0().upload();
                File file = this.g;
                if (file != null) {
                    str = file.getPath() + '_' + file.lastModified();
                } else {
                    str = null;
                }
                if (str != null) {
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE tryToFindCachedInfoForAttach: looking for cache with hash=".concat(str)});
                    }
                    c = upload2.c(str, h(attach));
                    if (c != null) {
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE tryToFindCachedInfoForAttach: found cached info=" + c + ", checking server existence"});
                        }
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE isCachedFileExistOnServer: checking file existence on server for " + c});
                        }
                        boolean booleanValue = ((Boolean) w2wVar.L0(this, new rpt(c))).booleanValue();
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", zhy0.a("UPLOAD_TRACE isCachedFileExistOnServer: file exists=", booleanValue)});
                        }
                        if (booleanValue) {
                            if (!L.m(loggerOutputTarget)) {
                                L.u(l, L.LogType.i, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE tryToFindCachedInfoForAttach: cached file exists on server, using cache"});
                            }
                            if (c == null) {
                                UserId userId = c.c;
                                long j = c.d;
                                String str2 = c.e;
                                L l2 = L.a;
                                l2.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l2, L.LogType.i, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE Cache hit for attach " + attach.xb() + ", ownerId=" + userId + ", mediaId=" + j});
                                }
                                otn.a.a("MsgAttachSingleUploadCmd", "Cache hit: cachedUploadInfo=" + c);
                                if (z) {
                                    AttachImage attachImage = (AttachImage) attach;
                                    attachImage.getClass();
                                    AttachImage attachImage2 = new AttachImage(attachImage);
                                    attachImage2.d = userId;
                                    attachImage2.e = j;
                                    attachImage2.t = str2;
                                    attach2 = attachImage2;
                                } else if (attach instanceof AttachVideo) {
                                    AttachVideo attachVideo = (AttachVideo) attach;
                                    attachVideo.getClass();
                                    AttachVideo attachVideo2 = new AttachVideo(attachVideo);
                                    attachVideo2.c(userId);
                                    attachVideo2.setId(j);
                                    attachVideo2.E(str2);
                                    attach2 = attachVideo2;
                                } else if (attach instanceof AttachDoc) {
                                    AttachDoc attachDoc = (AttachDoc) attach;
                                    attachDoc.getClass();
                                    AttachDoc attachDoc2 = new AttachDoc(attachDoc);
                                    attachDoc2.d = userId;
                                    attachDoc2.e = j;
                                    attachDoc2.s = str2;
                                    attach2 = attachDoc2;
                                } else {
                                    attach2 = attach;
                                }
                                attach2.S2(AttachSyncState.DONE);
                                g(w2wVar, attach2);
                                return attach2;
                            }
                            l.getClass();
                            if (!L.m(loggerOutputTarget)) {
                                L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE Cache miss for attach " + attach.xb()});
                            }
                        } else {
                            if (!L.m(loggerOutputTarget)) {
                                L.u(l, L.LogType.w, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE tryToFindCachedInfoForAttach: cached file does not exist on server, deleting cache"});
                            }
                            upload2.h(c);
                        }
                    } else if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE tryToFindCachedInfoForAttach: no cached info found for hash=".concat(str)});
                    }
                } else if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.w, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE tryToFindCachedInfoForAttach: could not generate fileHash for attach " + attach.xb()});
                }
            } else if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE tryToFindCachedInfoForAttach: cache not supported for attach type ".concat(attach.getClass().getSimpleName())});
            }
            c = null;
            if (c == null) {
            }
        } else {
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE Skipping cache check for attach " + attach.xb() + " (endpoint=" + attachUploadingEndpoint2 + ')'});
            }
        }
        L l4 = L.a;
        l4.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l4, L.LogType.d, new Object[]{"MsgAttachSingleUploadCmd", "UPLOAD_TRACE Uploader upload " + attach.xb()});
        }
        Attach attach3 = (Attach) odq0Var.a(attach, new z2e0() { // from class: xsna.dh30
            @Override // xsna.z2e0
            public final void onProgress(int i, int i2) {
                w2w w2wVar2 = w2w.this;
                Attach attach4 = attach;
                eh30 eh30Var = this;
                w2wVar2.S0().z(attach4, i, i2);
                if (eh30Var.d == AttachUploadingEndpoint.CHAT) {
                    Iterator<T> it = eh30Var.b.iterator();
                    while (it.hasNext()) {
                        long j2 = ((Peer) it.next()).b;
                        ComposingType composingType = attach4 instanceof AttachImage ? ComposingType.PHOTO : attach4 instanceof AttachVideo ? ComposingType.VIDEO : attach4 instanceof AttachDoc ? ComposingType.FILE : null;
                        if (composingType != null) {
                            ezi0.b bVar = ezi0.d;
                            synchronized (bVar) {
                                try {
                                    ezi0.b.a aVar = new ezi0.b.a(mq9.a(w2wVar2).b, j2);
                                    ezi0 b = bVar.b(aVar, composingType);
                                    if (b != null) {
                                        LinkedHashMap linkedHashMap = ezi0.f;
                                        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(aVar);
                                        if (cVar != null) {
                                            cVar.dispose();
                                        }
                                        linkedHashMap.put(aVar, w2wVar2.J0(eh30Var, b));
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                }
            }
        }).b;
        if (attachUploadingEndpoint2 == attachUploadingEndpoint) {
            ftx0 ftx0Var = attach3 instanceof ftx0 ? (ftx0) attach3 : null;
            if (ftx0Var != null && (i1 = ftx0Var.i1()) != null) {
                String str3 = i1.getPath() + '_' + i1.lastModified();
                if (str3 != null) {
                    if (attach3 instanceof AttachImage) {
                        AttachImage attachImage3 = (AttachImage) attach3;
                        wx8Var2 = new wx8(attachImage3.e, attachImage3.d, str3, "photo", attachImage3.t);
                    } else if (attach3 instanceof AttachVideo) {
                        AttachVideo attachVideo3 = (AttachVideo) attach3;
                        UserId I0 = attachVideo3.b.I0();
                        long id = attachVideo3.getId();
                        String C1 = attachVideo3.b.C1();
                        if (C1 == null) {
                            C1 = "";
                        }
                        wx8Var2 = new wx8(id, I0, str3, "video", C1);
                    } else if (attach3 instanceof AttachDoc) {
                        AttachDoc attachDoc3 = (AttachDoc) attach3;
                        wx8Var2 = new wx8(attachDoc3.e, attachDoc3.d, str3, "doc", attachDoc3.s);
                    }
                    wx8Var = wx8Var2;
                    if (wx8Var != null) {
                        upload.d(wx8Var);
                        upload.a();
                    }
                }
            }
            wx8Var = null;
            if (wx8Var != null) {
            }
        }
        attach3.S2(AttachSyncState.DONE);
        g(w2wVar, attach3);
        w2wVar.S0().f(attach3);
        w2wVar.S0().O(attach3);
        return attach3;
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgAttachSingleUploadCmd(dialogs=");
        sb.append(this.b);
        sb.append(", attach=");
        sb.append(this.c);
        sb.append(", endpoint=");
        sb.append(this.d);
        sb.append(", prefetchMode=");
        sb.append(this.e);
        sb.append(", channelId=");
        return iq.b(sb, this.f, ')');
    }
}
