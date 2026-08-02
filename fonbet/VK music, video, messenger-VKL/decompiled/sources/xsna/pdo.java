package xsna;

import com.vk.dto.clips.external.ClipsDuetInfo;
import java.util.ArrayList;

/* compiled from: DraftSyncingState.kt */
/* loaded from: classes16.dex */
public final class pdo {
    public final ArrayList a;
    public final yco b;
    public final ArrayList c;
    public final ArrayList d;
    public final ClipsDuetInfo e;
    public final int f;
    public final float g;
    public final String h;

    public pdo(ArrayList arrayList, yco ycoVar, ArrayList arrayList2, ArrayList arrayList3, ClipsDuetInfo clipsDuetInfo, int i, float f, String str) {
        this.a = arrayList;
        this.b = ycoVar;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = clipsDuetInfo;
        this.f = i;
        this.g = f;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdo)) {
            return false;
        }
        pdo pdoVar = (pdo) obj;
        return this.a.equals(pdoVar.a) && epx.f(this.b, pdoVar.b) && this.c.equals(pdoVar.c) && this.d.equals(pdoVar.d) && epx.f(this.e, pdoVar.e) && this.f == pdoVar.f && Float.compare(this.g, pdoVar.g) == 0 && epx.f(this.h, pdoVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yco ycoVar = this.b;
        int a = qr.a(this.d, qr.a(this.c, (hashCode + (ycoVar == null ? 0 : ycoVar.hashCode())) * 31, 31), 31);
        ClipsDuetInfo clipsDuetInfo = this.e;
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.g, shy.a(this.f, (a + (clipsDuetInfo == null ? 0 : clipsDuetInfo.hashCode())) * 31, 31), 31);
        String str = this.h;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftSyncingState(stickers=");
        sb.append(this.a);
        sb.append(", licensedMusic=");
        sb.append(this.b);
        sb.append(", audioItems=");
        sb.append(this.c);
        sb.append(", videoDataList=");
        sb.append(this.d);
        sb.append(", duetInfo=");
        sb.append(this.e);
        sb.append(", maxDurationMs=");
        sb.append(this.f);
        sb.append(", aspectRatio=");
        sb.append(this.g);
        sb.append(", description=");
        return ho8.a(sb, this.h, ')');
    }
}
