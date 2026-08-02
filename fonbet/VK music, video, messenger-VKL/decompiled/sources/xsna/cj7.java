package xsna;

import android.os.Bundle;
import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.comments.core.BoardComment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import xsna.li7;

/* compiled from: BoardTopicViewFragment.kt */
/* loaded from: classes6.dex */
public final class cj7 implements hx2<Integer> {
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BoardTopicViewFragment d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ List<Attachment> g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public cj7(String str, boolean z, BoardTopicViewFragment boardTopicViewFragment, String str2, boolean z2, List<? extends Attachment> list, boolean z3) {
        this.b = str;
        this.c = z;
        this.d = boardTopicViewFragment;
        this.e = str2;
        this.f = z2;
        this.g = list;
        this.h = z3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hx2
    public final void b(Integer num) {
        int i;
        yh7 yh7Var;
        yh7 yh7Var2;
        String str;
        String str2;
        Integer num2 = num;
        final BoardTopicViewFragment boardTopicViewFragment = this.d;
        ?? r2 = boardTopicViewFragment.f0;
        boolean z = this.c;
        String str3 = this.b;
        if (z) {
            if (boardTopicViewFragment.x0 > 0 && (str = this.e) != null) {
                if (brm0.B(str, boardTopicViewFragment.z0 + ',', false)) {
                    Regex regex = new Regex(Pattern.quote(boardTopicViewFragment.z0));
                    UserId userId = boardTopicViewFragment.y0;
                    String str4 = boardTopicViewFragment.z0;
                    UserId ro = boardTopicViewFragment.ro();
                    int i2 = boardTopicViewFragment.x0;
                    StringBuilder sb = new StringBuilder(X3.j.d);
                    long j = userId.b;
                    if (j > 0) {
                        str2 = defpackage.k0.a(j, "id");
                    } else {
                        str2 = "club" + (-j);
                    }
                    sb.append(str2);
                    sb.append(":bp-");
                    sb.append(ro.b);
                    sb.append('_');
                    sb.append(i2);
                    sb.append('|');
                    sb.append(str4);
                    sb.append(']');
                    str3 = regex.i(str, sb.toString());
                }
            }
            WriteBar writeBar = boardTopicViewFragment.k0;
            if (writeBar != null) {
                writeBar.setText("");
            }
            WriteBar writeBar2 = boardTopicViewFragment.k0;
            if (writeBar2 != null) {
                writeBar2.F();
            }
            boardTopicViewFragment.A0 = false;
            i = -1;
            boardTopicViewFragment.x0 = -1;
        } else {
            i = -1;
        }
        final String str5 = str3;
        Pattern pattern = BoardTopicViewFragment.H0;
        if (boardTopicViewFragment.so() == i) {
            u1u0.m(8, boardTopicViewFragment.u0);
            if (boardTopicViewFragment.getArguments() != null) {
                if (num2 != null) {
                    Bundle arguments = boardTopicViewFragment.getArguments();
                    if (arguments == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arguments.putInt("id", num2.intValue());
                }
                boardTopicViewFragment.b0.add(new mi7(boardTopicViewFragment.getString(R.string.copy_link)));
                boardTopicViewFragment.to();
            }
            if (num2 != null && (yh7Var2 = boardTopicViewFragment.r0) != null) {
                yh7Var2.l = num2.intValue();
            }
            yh7 yh7Var3 = boardTopicViewFragment.r0;
            if (yh7Var3 != null) {
                yh7Var3.c(0, boardTopicViewFragment.requireContext());
            }
            boardTopicViewFragment.B0 = false;
            return;
        }
        yh7 yh7Var4 = boardTopicViewFragment.r0;
        if (yh7Var4 != null && !yh7Var4.e.isEmpty()) {
            int i3 = 1;
            if (yh7Var4.e.getLast().n == yh7Var4.c - 1) {
                if (!this.f || num2 == null) {
                    if (num2 != null && (yh7Var = boardTopicViewFragment.r0) != null) {
                        yh7Var.d(BoardComment.zb(num2.intValue(), str5, this.g, 0, boardTopicViewFragment.ro(), this.h, null));
                    }
                    boardTopicViewFragment.B0 = false;
                    ((ysg0) r2.getValue()).a(new li7.c(boardTopicViewFragment.ro()));
                    return;
                }
                final int intValue = num2.intValue();
                final m4 m4Var = new m4(boardTopicViewFragment, 10);
                aq1 aq1Var = new aq1(i3, boardTopicViewFragment, m4Var);
                final List<Attachment> list = this.g;
                final boolean z2 = this.h;
                boardTopicViewFragment.po(intValue, new gzs() { // from class: xsna.si7
                    @Override // xsna.gzs
                    public final Object invoke() {
                        BoardTopicViewFragment boardTopicViewFragment2 = BoardTopicViewFragment.this;
                        yh7 yh7Var5 = boardTopicViewFragment2.r0;
                        if (yh7Var5 != null) {
                            yh7Var5.d(BoardComment.zb(intValue, str5, list, 0, boardTopicViewFragment2.ro(), z2, null));
                        }
                        boardTopicViewFragment2.B0 = false;
                        m4Var.invoke();
                        return s3q0.a;
                    }
                }, aq1Var);
                return;
            }
        }
        cvk.u(R.string.board_comment_sent, false);
        boardTopicViewFragment.B0 = false;
        ((ysg0) r2.getValue()).a(new li7.c(boardTopicViewFragment.ro()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        BoardTopicViewFragment boardTopicViewFragment = this.d;
        if (!((o2i) boardTopicViewFragment.h0.getValue()).d(vKApiExecutionException, true)) {
            h03.b(vKApiExecutionException);
        }
        boardTopicViewFragment.B0 = false;
    }
}
