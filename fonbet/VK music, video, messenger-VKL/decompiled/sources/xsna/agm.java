package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.stories.ImStoryState;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class agm implements ogm {
    public final Dialog b;
    public final Msg c;
    public final String d;
    public final CharSequence e;
    public final ProfilesSimpleInfo f;
    public final boolean g;
    public final boolean h;
    public final hcm i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p = true;
    public final boolean q = true;
    public final boolean r = true;
    public final boolean s = true;
    public final ImStoryState t;
    public final boolean u;
    public final boolean v;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        if (r5.zb(r1 != null ? r1.a : null) != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public agm(Dialog dialog, Msg msg, String str, CharSequence charSequence, ProfilesSimpleInfo profilesSimpleInfo, boolean z, boolean z2, hcm hcmVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, ImStoryState imStoryState, boolean z9) {
        this.b = dialog;
        this.c = msg;
        this.d = str;
        this.e = charSequence;
        this.f = profilesSimpleInfo;
        this.g = z;
        this.h = z2;
        this.i = hcmVar;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        boolean z10 = true;
        this.t = imStoryState;
        this.u = z9;
        if (profilesSimpleInfo.Ab(dialog.Sb()) != null && (msg == null || profilesSimpleInfo.zb(msg.getFrom()) != null)) {
            if (!hcmVar.b.isEmpty()) {
                vh30 vh30Var = (vh30) j5g.a0(j5g.O0(hcmVar.b));
            }
            this.v = z10;
        }
        z10 = false;
        this.v = z10;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!agm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        agm agmVar = (agm) obj;
        return epx.f(this.b, agmVar.b) && epx.f(this.c, agmVar.c) && epx.f(this.d, agmVar.d) && epx.f(this.e, agmVar.e) && this.g == agmVar.g && this.h == agmVar.h && epx.f(this.i, agmVar.i) && this.v == agmVar.v && this.j == agmVar.j && this.k == agmVar.k && this.t == agmVar.t;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return this.b.Sb();
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Msg msg = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (msg != null ? msg.hashCode() : 0)) * 31)) * 31;
        CharSequence charSequence = this.e;
        return this.t.hashCode() + qoy.b(qoy.b(qoy.b((this.i.hashCode() + qoy.b(qoy.b((hashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.g), 31, this.h)) * 31, 31, this.v), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogItem(dialog=");
        sb.append(this.b);
        sb.append(", msg=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append((Object) this.d);
        sb.append(", body=");
        sb.append((Object) this.e);
        sb.append(", profiles=");
        sb.append(this.f);
        sb.append(", sending=");
        sb.append(this.g);
        sb.append(", failed=");
        sb.append(this.h);
        sb.append(", composing=");
        sb.append(this.i);
        sb.append(", isOnlineVisible=");
        sb.append(this.j);
        sb.append(", isActive=");
        sb.append(this.k);
        sb.append(", useChatsMembersCountAsDialogDescription=");
        sb.append(this.l);
        sb.append(", isPinDialogsEnabled=");
        sb.append(this.m);
        sb.append(", isPreviewEnabled=");
        sb.append(this.n);
        sb.append(", isDialogsBirthdayCakeEnabled=");
        sb.append(this.o);
        sb.append(", showStatus=");
        sb.append(this.p);
        sb.append(", showTime=");
        sb.append(this.q);
        sb.append(", showMuted=");
        sb.append(this.r);
        sb.append(", isLongClickEnabled=");
        sb.append(this.s);
        sb.append(", storiesState=");
        sb.append(this.t);
        sb.append(", hasReplyButton=");
        return defpackage.q0.a(sb, this.u, ')');
    }
}
