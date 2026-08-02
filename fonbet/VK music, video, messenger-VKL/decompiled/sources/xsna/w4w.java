package xsna;

import android.content.DialogInterface;
import com.vk.dto.stories.model.StoryEntry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w4w implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w4w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                tol tolVar = (tol) this.c;
                dialogInterface.dismiss();
                tolVar.invoke(0);
                break;
            case 1:
                ((i5) this.c).invoke();
                dialogInterface.dismiss();
                break;
            default:
                sbl0 sbl0Var = (sbl0) this.c;
                ((anm0) sbl0Var.m.getValue()).h();
                jfm0 jfm0Var = (jfm0) sbl0Var.l.getValue();
                StoryEntry storyEntry = sbl0Var.c;
                sbl0Var.g.b(jfm0Var.l(storyEntry.c, storyEntry.d, sbl0Var.d.b).m(asu0.a.d()).subscribe(new j7l0(new vlc0(sbl0Var, 14), 1), new l8w(new fda0(sbl0Var, 10), 26)));
                break;
        }
    }
}
