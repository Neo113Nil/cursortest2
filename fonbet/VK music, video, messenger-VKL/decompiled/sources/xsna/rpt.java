package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKInternalServerErrorException;
import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.ij20;

/* compiled from: GetAttachFileExistStatusCmd.kt */
/* loaded from: classes2.dex */
public final class rpt extends le6<Boolean> {
    public final wx8 b;
    public final boolean c = true;

    public rpt(wx8 wx8Var) {
        this.b = wx8Var;
    }

    public static String f(wx8 wx8Var) {
        String str = wx8Var.e;
        long j = wx8Var.d;
        UserId userId = wx8Var.c;
        if (str.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append('_');
            sb.append(j);
            return sb.toString();
        }
        return userId + '_' + j + '_' + wx8Var.e;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        ij20 ij20Var;
        wx8 wx8Var = this.b;
        String str = wx8Var.b;
        String m = bz2.m();
        Integer num = 0;
        int hashCode = str.hashCode();
        boolean z = this.c;
        if (hashCode == 99640) {
            if (str.equals("doc")) {
                ij20.a aVar = new ij20.a();
                aVar.d = m;
                aVar.c = "docs.getById";
                aVar.b("docs", f(wx8Var));
                aVar.f.put("extended", num.toString());
                aVar.i = z;
                ij20Var = new ij20(aVar);
            }
            ij20Var = null;
        } else if (hashCode != 106642994) {
            if (hashCode == 112202875 && str.equals("video")) {
                ij20.a aVar2 = new ij20.a();
                aVar2.d = m;
                aVar2.c = "video.get";
                aVar2.b("videos", f(wx8Var));
                aVar2.f.put("extended", num.toString());
                aVar2.i = z;
                ij20Var = new ij20(aVar2);
            }
            ij20Var = null;
        } else {
            if (str.equals("photo")) {
                ij20.a aVar3 = new ij20.a();
                aVar3.d = m;
                aVar3.c = "photos.getById";
                aVar3.b("photos", f(wx8Var));
                aVar3.f.put("extended", num.toString());
                aVar3.i = z;
                ij20Var = new ij20(aVar3);
            }
            ij20Var = null;
        }
        if (ij20Var == null) {
            return Boolean.FALSE;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        try {
            bz2.f(ij20Var, new qpt(ref$BooleanRef, this));
        } catch (Exception e) {
            if (!(e instanceof VKApiExecutionException) && !(e instanceof VKInternalServerErrorException)) {
                throw e;
            }
            ref$BooleanRef.element = false;
        }
        return Boolean.valueOf(ref$BooleanRef.element);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpt)) {
            return false;
        }
        rpt rptVar = (rpt) obj;
        return epx.f(this.b, rptVar.b) && this.c == rptVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GetAttachFileExistStatusCmd(cacheUploadInfo=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
