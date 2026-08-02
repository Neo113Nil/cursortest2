package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.presentation.model.AudioBookModel;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlaySource;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.od4;
import xsna.ph4;
import xsna.rd4;

/* compiled from: AudioBookFeature.kt */
/* loaded from: classes3.dex */
public final class ng4 extends wk50<xd4, wd4, od4, rd4> {
    public final ch4 f;
    public final AudioBookModel g;
    public final u2b0 h;
    public final u750 i;
    public final f4z j;
    public final io.reactivex.rxjava3.disposables.g k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ng4(AudioBookBottomSheetLaunchPoint audioBookBottomSheetLaunchPoint, ch4 ch4Var, AudioBookModel audioBookModel, u2b0 u2b0Var, u750 u750Var, xl40 xl40Var) {
        super(r1, new td4(new wd4(audioBookModel, r13)));
        Boolean bool;
        List list;
        int i = audioBookModel.k;
        od4.f fVar = od4.f.b;
        boolean z = BuildInfo.u() && !jnj.d(i);
        com.vk.music.bottomsheets.audiobook.a aVar = new com.vk.music.bottomsheets.audiobook.a(u2b0Var, z, i, xl40Var);
        StartPlaySource j = u2b0Var.j();
        if (audioBookBottomSheetLaunchPoint.equals(AudioBookBottomSheetLaunchPoint.BigPlayer.b) || audioBookBottomSheetLaunchPoint.equals(AudioBookBottomSheetLaunchPoint.SmallPlayer.b)) {
            StartPlayAudioBookSource startPlayAudioBookSource = j instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) j : null;
            if (startPlayAudioBookSource == null || (bool = startPlayAudioBookSource.f) == null) {
                list = EmptyList.b;
            } else {
                boolean booleanValue = bool.booleanValue();
                ArrayList<s10> arrayList = new ArrayList<>();
                aVar.d(arrayList, booleanValue);
                if (z) {
                    aVar.b(arrayList);
                }
                aVar.c(arrayList);
                aVar.a(arrayList);
                list = arrayList;
            }
        } else if (audioBookBottomSheetLaunchPoint instanceof AudioBookBottomSheetLaunchPoint.AudioBookListPoint) {
            boolean z2 = ((AudioBookBottomSheetLaunchPoint.AudioBookListPoint) audioBookBottomSheetLaunchPoint).b;
            ArrayList<s10> arrayList2 = new ArrayList<>();
            aVar.d(arrayList2, z2);
            if (z) {
                aVar.b(arrayList2);
            }
            aVar.a(arrayList2);
            aVar.c(arrayList2);
            aVar.e(arrayList2);
            list = arrayList2;
        } else {
            if (!(audioBookBottomSheetLaunchPoint instanceof AudioBookBottomSheetLaunchPoint.AudioBookScreen)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z3 = ((AudioBookBottomSheetLaunchPoint.AudioBookScreen) audioBookBottomSheetLaunchPoint).c;
            ArrayList<s10> arrayList3 = new ArrayList<>();
            if (z) {
                aVar.b(arrayList3);
            }
            aVar.c(arrayList3);
            aVar.a(arrayList3);
            aVar.d(arrayList3, z3);
            arrayList3.add(new s10(R.drawable.vk_icon_user_outline_28, R.string.audio_book_go_author, od4.c.b));
            arrayList3.add(new s10(R.drawable.vk_icon_user_microphone_badge_outline_28, R.string.audio_book_go_narrator, od4.d.b));
            aVar.e(arrayList3);
            list = arrayList3;
        }
        this.f = ch4Var;
        this.g = audioBookModel;
        this.h = u2b0Var;
        this.i = u750Var;
        this.j = new f4z();
        this.k = new io.reactivex.rxjava3.disposables.g();
    }

    @Override // xsna.wk50
    public final void N(wd4 wd4Var, od4 od4Var) {
        od4 od4Var2 = od4Var;
        AudioBookModel audioBookModel = wd4Var.b;
        if (od4Var2.equals(od4.f.b)) {
            T(new rd4.a(audioBookModel));
            return;
        }
        boolean equals = od4Var2.equals(od4.h.b);
        AudioBookModel audioBookModel2 = this.g;
        f4z f4zVar = this.j;
        if (equals) {
            f4zVar.b(new ph4.g(audioBookModel2.h));
            return;
        }
        boolean equals2 = od4Var2.equals(od4.k.b);
        io.reactivex.rxjava3.disposables.g gVar = this.k;
        ch4 ch4Var = this.f;
        if (equals2) {
            final int i = audioBookModel2.b;
            final String str = audioBookModel2.g;
            gVar.b(new io.reactivex.rxjava3.internal.operators.completable.h(S(R(ch4Var.c(i, str, jnj.d(audioBookModel2.k)))), new kz(this, 1)).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.kg4
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    ng4 ng4Var = ng4.this;
                    int i2 = i;
                    ng4Var.U(i2, false);
                    ng4Var.j.b(new ph4.l(true));
                    ng4Var.i.s0(i2, str, false);
                }
            }, new lz(new tb(this, 11), 5)));
            return;
        }
        if (od4Var2.equals(od4.i.b)) {
            final int i2 = audioBookModel2.b;
            final String str2 = audioBookModel2.g;
            gVar.b(new io.reactivex.rxjava3.internal.operators.completable.h(S(R(ch4Var.a(i2, str2, jnj.d(audioBookModel2.k)))), new lg4(this, 0)).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.mg4
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    ng4 ng4Var = ng4.this;
                    int i3 = i2;
                    ng4Var.U(i3, true);
                    ng4Var.j.b(new ph4.i(true));
                    ng4Var.i.s0(i3, str2, true);
                }
            }, new qs2(new com.vk.movika.sdk.base.observable.k(this, 8), 3)));
            return;
        }
        if (od4Var2.equals(od4.j.b)) {
            f4zVar.b(ph4.k.a);
            return;
        }
        if (od4Var2.equals(od4.g.b)) {
            gVar.b(new io.reactivex.rxjava3.internal.operators.completable.h(R(S(ch4Var.e(audioBookModel2.b))), new ig4(this, 0)).subscribe(new jg4(this, 0), new jz(new iz(this, 2), 3)));
            return;
        }
        if (od4Var2.equals(od4.a.b)) {
            f4zVar.b(ph4.a.a);
            return;
        }
        if (od4Var2.equals(od4.c.b)) {
            f4zVar.b(new ph4.d(audioBookModel.i));
            return;
        }
        if (od4Var2.equals(od4.d.b)) {
            f4zVar.b(new ph4.d(audioBookModel.j));
        } else if (od4Var2.equals(od4.e.b)) {
            f4zVar.b(ph4.c.a);
        } else {
            if (!od4Var2.equals(od4.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(ph4.b.a);
        }
    }

    public final void U(int i, boolean z) {
        AudioBook audioBook;
        StartPlaySource j = this.h.j();
        StartPlayAudioBookSource startPlayAudioBookSource = j instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) j : null;
        if (startPlayAudioBookSource == null || (audioBook = startPlayAudioBookSource.c) == null || audioBook.b != i) {
            return;
        }
        startPlayAudioBookSource.f = Boolean.valueOf(z);
    }
}
