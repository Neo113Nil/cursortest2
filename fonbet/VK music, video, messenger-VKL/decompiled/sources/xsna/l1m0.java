package xsna;

import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import java.util.ArrayList;

/* compiled from: StoryEditorCommonStatProvider.kt */
/* loaded from: classes18.dex */
public final class l1m0 {
    public final i5g a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final tam0 h;
    public final StoryUploadParams i;
    public final CommonUploadParams j;
    public final ArrayList k;

    public l1m0(i5g i5gVar, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, tam0 tam0Var, StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams, ArrayList arrayList) {
        this.a = i5gVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = tam0Var;
        this.i = storyUploadParams;
        this.j = commonUploadParams;
        this.k = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1m0)) {
            return false;
        }
        l1m0 l1m0Var = (l1m0) obj;
        return this.a.equals(l1m0Var.a) && epx.f(this.b, l1m0Var.b) && this.c == l1m0Var.c && this.d == l1m0Var.d && this.e == l1m0Var.e && this.f == l1m0Var.f && this.g == l1m0Var.g && this.h.equals(l1m0Var.h) && epx.f(this.i, l1m0Var.i) && epx.f(this.j, l1m0Var.j) && this.k.equals(l1m0Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + ((this.h.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31;
        CommonUploadParams commonUploadParams = this.j;
        return this.k.hashCode() + ((hashCode + (commonUploadParams == null ? 0 : commonUploadParams.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryEditorCommonStat(stickers=");
        sb.append(this.a);
        sb.append(", editorType=");
        sb.append(this.b);
        sb.append(", hasText=");
        sb.append(this.c);
        sb.append(", hasDrawing=");
        sb.append(this.d);
        sb.append(", hasStickers=");
        sb.append(this.e);
        sb.append(", hasSave=");
        sb.append(this.f);
        sb.append(", isDrawingViewDefault=");
        sb.append(this.g);
        sb.append(", currentRawData=");
        sb.append(this.h);
        sb.append(", baseStoryUploadParamsCopy=");
        sb.append(this.i);
        sb.append(", commonUploadParams=");
        sb.append(this.j);
        sb.append(", drawingStats=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.k);
    }
}
