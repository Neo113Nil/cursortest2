package com.vk.writebar;

import android.app.Activity;
import android.net.Uri;
import com.ironsource.X3;
import com.vk.api.video.VideoSave;
import com.vk.audio.AudioMsgTrackByRecord;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.pending.PendingAudioMessageAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.writebar.WriteBar;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.b2y0;
import xsna.c24;
import xsna.cdm;
import xsna.cvk;
import xsna.d8t0;
import xsna.fnw0;
import xsna.g760;
import xsna.gzs;
import xsna.icq0;
import xsna.jeq0;
import xsna.jgl;
import xsna.msy;
import xsna.myc0;
import xsna.o84;
import xsna.o8u0;
import xsna.oeq0;
import xsna.pc;
import xsna.pis0;
import xsna.q0y0;
import xsna.s0y0;
import xsna.u7v0;
import xsna.ymw;

/* compiled from: WriteBarAttachHolder.kt */
/* loaded from: classes7.dex */
public final class c {
    public final WriteBar a;
    public final WriteBar b;
    public final g c;
    public final WriteBarPermissionsHolder d;
    public final b2y0 e;
    public final cdm f;
    public s0y0 g;
    public final Object h;
    public ymw i;
    public final Object j;
    public FragmentImpl k;
    public o84 l;
    public Activity m;
    public boolean n;
    public g760 o;
    public String p;
    public Runnable q;
    public Runnable r;
    public int s;
    public boolean t;
    public boolean u;
    public UserId v;
    public icq0 w;
    public icq0.a x;
    public pc y;
    public gzs<Boolean> z;

    public c(WriteBar writeBar, WriteBar writeBar2, g gVar, WriteBarPermissionsHolder writeBarPermissionsHolder, b2y0 b2y0Var, cdm cdmVar) {
        this.a = writeBar;
        this.b = writeBar2;
        this.c = gVar;
        this.d = writeBarPermissionsHolder;
        this.e = b2y0Var;
        this.f = cdmVar;
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new q0y0(this, 0));
        this.h = a;
        this.j = a;
        this.s = 10;
        this.u = true;
        this.v = UserId.d;
        this.z = new c24(0);
    }

    public final void a(Attachment attachment) {
        Attachment attachment2;
        AttachmentsEditorView.j jVar;
        s0y0 s0y0Var = this.g;
        if (s0y0Var == null || !s0y0Var.i(attachment)) {
            if (c().getCount() >= this.s && !(attachment instanceof FwdMessagesAttachment)) {
                h();
                return;
            }
            boolean z = attachment instanceof PendingAudioMessageAttachment;
            boolean z2 = false;
            WriteBar writeBar = this.b;
            if (z) {
                AttachmentsEditorView c = c();
                c.getClass();
                L.p("vk", "Attach editor add hidden");
                ArrayList<Attachment> arrayList = c.c;
                arrayList.clear();
                arrayList.add(attachment);
                c.e = true;
                long j = writeBar.getState().a;
                PendingAudioMessageAttachment pendingAudioMessageAttachment = (PendingAudioMessageAttachment) attachment;
                if (pendingAudioMessageAttachment.z == null) {
                    byte[] bArr = pendingAudioMessageAttachment.y;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    pendingAudioMessageAttachment.z = new AudioMsgTrackByRecord(pendingAudioMessageAttachment.k, 0, pendingAudioMessageAttachment.o, pendingAudioMessageAttachment.x, pendingAudioMessageAttachment.g, bArr);
                }
                this.c.b().c.put(Long.valueOf(j), pendingAudioMessageAttachment.z);
            } else if (attachment instanceof PollAttachment) {
                ArrayList<Attachment> arrayList2 = c().c;
                int i = 0;
                while (true) {
                    if (i >= arrayList2.size()) {
                        i = -1;
                        break;
                    } else if (arrayList2.get(i) instanceof PollAttachment) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    AttachmentsEditorView c2 = c();
                    c2.getClass();
                    try {
                        c2.b.removeViewAt(i);
                        attachment2 = c2.c.remove(i);
                    } catch (Exception e) {
                        L.i(e);
                        attachment2 = null;
                    }
                    if (attachment2 != null && (jVar = c2.d) != null) {
                        jVar.b(attachment2);
                    }
                }
                c().a(attachment, null);
            } else {
                c().a(attachment, null);
            }
            if (c().getRealCount() > 0 && !c().e) {
                z2 = true;
            }
            g(z2);
            writeBar.I();
            writeBar.J(true);
            f();
        }
    }

    public final void b(int i, Uri uri) {
        Uri uri2;
        Uri uri3;
        VideoFileOld videoFileOld = new VideoFileOld();
        String n = com.vk.core.files.a.n(uri);
        if (n == null || (uri2 = jeq0.g(n)) == null) {
            uri2 = uri;
            uri3 = uri2;
        } else {
            uri3 = uri;
        }
        Uri f = oeq0.f(uri3, uri2);
        HashMap hashMap = new HashMap();
        VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
        String uri4 = f.toString();
        if (uri4 != null) {
            if (!myc0.f(uri4)) {
                uri4 = null;
            }
            if (uri4 != null) {
                VideoUrlStorage.b bVar = VideoUrlStorage.c;
                VideoUrlStorage.d.b(hashMap, videoUrl, uri4);
            }
        }
        videoFileOld.f = new VideoUrlStorage(hashMap);
        videoFileOld.e = i;
        String lastPathSegment = X3.i.b.equals(uri3.getScheme()) ? uri3.getLastPathSegment() : uri2.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        videoFileOld.l = lastPathSegment;
        videoFileOld.c = 0;
        videoFileOld.I0 = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(f.toString(), 0, 0, null, (char) 0, false, 56, null)));
        WriteBar writeBar = this.b;
        PendingVideoAttachment pendingVideoAttachment = new PendingVideoAttachment(videoFileOld, writeBar.getState().o == WriteBar.Source.COMMUNITY_CHANNEL ? VideoSave.Target.CHANNEL : writeBar.getState().a != 0 ? VideoSave.Target.MESSAGES : writeBar.getState().c == 0 ? VideoSave.Target.COMMENT : VideoSave.Target.BOARD, this.v);
        s0y0 s0y0Var = this.g;
        if (s0y0Var == null || !s0y0Var.i(pendingVideoAttachment)) {
            c().a(pendingVideoAttachment, null);
        }
        writeBar.J(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AttachmentsEditorView c() {
        return (AttachmentsEditorView) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList<Attachment> d() {
        return !this.h.isInitialized() ? new ArrayList<>(0) : c().getAll();
    }

    public final void e(AttachmentsEditorView attachmentsEditorView, ymw ymwVar) {
        Activity activity = this.m;
        if (activity == null) {
            activity = null;
        }
        u7v0 u7v0Var = new u7v0(this, 7);
        g760 g760Var = this.o;
        String str = this.p;
        if (ymwVar == null) {
            ymwVar = new jgl(activity != null ? activity : null);
        }
        o84 o84Var = new o84(activity, attachmentsEditorView, u7v0Var, g760Var, str, ymwVar, new pis0(this, 21), new d8t0(this, 14), new fnw0(attachmentsEditorView, 2), new o8u0(this, 7));
        this.l = o84Var;
        attachmentsEditorView.setAttachmentsClickListener(o84Var);
        o84 o84Var2 = this.l;
        if (o84Var2 != null) {
            o84Var2.p = this.g;
        }
    }

    public final void f() {
        s0y0 s0y0Var = this.g;
        if (s0y0Var != null) {
            s0y0Var.g();
        }
        if (d().isEmpty()) {
            s0y0 s0y0Var2 = this.g;
            if (s0y0Var2 != null) {
                s0y0Var2.f();
            }
            this.r = null;
            this.q = null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(boolean z) {
        if (z) {
            c().setVisibility(0);
        } else if (this.h.isInitialized()) {
            c().setVisibility(8);
        }
        this.b.p0();
        this.a.requestLayout();
    }

    public final void h() {
        if (this.u) {
            cvk.w(this.a.getContext().getResources().getString(R.string.attachments_limit, Integer.valueOf(this.s)), false);
        }
    }
}
