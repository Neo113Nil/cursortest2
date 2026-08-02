package xsna;

import com.vk.api.generated.messages.dto.MessagesFolderDto;
import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.dialogs.FolderType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.lqm;
import xsna.u2s;

/* compiled from: DialogsFolderCreateLpTask.kt */
/* loaded from: classes2.dex */
public final class tpm extends e500 {
    public final int c;
    public final String d;
    public final int e;
    public final w2w f;
    public final int g;

    public tpm(int i, String str, int i2, w2w w2wVar) {
        super("DialogsFolderCreateLpTask");
        this.c = i;
        this.d = str;
        this.e = i2;
        this.f = w2wVar;
        this.g = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // xsna.e500
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c400 c400Var, f400 f400Var) {
        boolean o;
        List<MessagesFolderDto> e;
        Object obj;
        com.vk.im.engine.models.c experiments = this.f.getExperiments();
        int i = this.g;
        if ((i & 1) == 1) {
            FolderType.b bVar = FolderType.Companion;
            int v = c4g0.v(i);
            bVar.getClass();
            switch (u2s.a.$EnumSwitchMapping$0[FolderType.b.b(v).ordinal()]) {
                case 1:
                case 4:
                    o = true;
                    if (o) {
                        LinkedHashSet linkedHashSet = f400Var.m;
                        int i2 = this.c;
                        Integer valueOf = Integer.valueOf(i2);
                        MessagesFoldersInfoDto messagesFoldersInfoDto = c400Var.n;
                        List<String> list = null;
                        if (messagesFoldersInfoDto != null && (e = messagesFoldersInfoDto.e()) != null) {
                            Iterator<T> it = e.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((MessagesFolderDto) obj).getId() == i2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            MessagesFolderDto messagesFolderDto = (MessagesFolderDto) obj;
                            if (messagesFolderDto != null) {
                                list = messagesFolderDto.e();
                            }
                        }
                        p4g.a(valueOf, linkedHashSet, list == null);
                        return;
                    }
                    return;
                case 2:
                    o = experiments.o();
                    if (o) {
                    }
                    break;
                case 3:
                    if (!BuildInfo.s()) {
                        experiments.getClass();
                    }
                    o = true;
                    if (o) {
                    }
                    break;
                case 5:
                    o = BuildInfo.s();
                    if (o) {
                    }
                    break;
                case 6:
                case 7:
                    o = false;
                    if (o) {
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.J.add(Integer.valueOf(this.c));
        if ((this.g & 1) == 1) {
            z300Var.N = true;
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        FolderType.b bVar = FolderType.Companion;
        int i = this.g;
        int v = c4g0.v(i);
        bVar.getClass();
        upm upmVar = new upm(new rdm(this.c, this.d, FolderType.b.b(v), i));
        w2w w2wVar = this.f;
        upmVar.o(w2wVar);
        MessagesFoldersInfoDto messagesFoldersInfoDto = c400Var.n;
        if (messagesFoldersInfoDto != null) {
            lqm.a.a(messagesFoldersInfoDto).o(w2wVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpm)) {
            return false;
        }
        tpm tpmVar = (tpm) obj;
        return this.c == tpmVar.c && epx.f(this.d, tpmVar.d) && this.e == tpmVar.e && epx.f(this.f, tpmVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + shy.a(this.e, urd0.a(Integer.hashCode(this.c) * 31, 31, this.d), 31);
    }

    public final String toString() {
        return "DialogsFolderCreateLpTask(id=" + this.c + ", name=" + this.d + ", flags=" + this.e + ", env=" + this.f + ')';
    }
}
