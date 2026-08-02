package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.api.posting.attachments.AttachType;
import com.vk.sharing.api.dto.Target;
import java.util.Date;
import java.util.List;

/* compiled from: PostingContract.kt */
/* loaded from: classes3.dex */
public interface qdc0 extends gm6, iqc0, j34, f420, l420, qtj, jdc0, o9q0 {
    void A1(Attachment attachment);

    void Al();

    void B1();

    List<DonutPostingSettings.Duration> B6();

    boolean Bc(int i);

    void Ca();

    boolean Cc();

    void Cf();

    void Da(xac0 xac0Var);

    void Dg(int i, String str, String str2);

    void Di();

    void E6();

    void Fh(c84 c84Var);

    void G();

    void G4();

    boolean G6();

    boolean Jc();

    Integer Ld();

    void M6(Integer num);

    void Na();

    ldc0 Pe();

    UserId Qj();

    void Qk(CharSequence charSequence);

    void Te();

    void Uf();

    void Uk(String str);

    Date Um();

    void W2(String str);

    boolean X4();

    void Xc();

    void Xl();

    boolean Zg();

    void Zi();

    void a(io.reactivex.rxjava3.disposables.c cVar);

    void cf(MediaStoreEntry mediaStoreEntry);

    boolean cg();

    void e1(Date date);

    int fe();

    void g2();

    CharSequence getText();

    UserId getUid();

    void h8(xac0 xac0Var);

    void hb(AttachType attachType);

    void j2(boolean z);

    void ll(Target target);

    void n2(Attachment attachment);

    void n5();

    boolean nb();

    void nl(List<xac0> list, boolean z);

    void o();

    boolean od();

    void q0();

    void qh();

    void s3(AttachmentType attachmentType);

    List<Attachment> u();

    void ue(boolean z);

    void w();

    boolean wh();

    void wj(c84 c84Var);

    void y0();

    boolean yd();
}
