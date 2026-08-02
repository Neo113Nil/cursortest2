package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: UploadBlurAttachmentsCmd.kt */
/* loaded from: classes2.dex */
public final class aaq0 extends le6<Map<Integer, ? extends AttachImage>> {
    public final ArrayList b;
    public final long c;
    public final Set<Peer> d;

    public aaq0(ArrayList arrayList, long j, Set set) {
        this.b = arrayList;
        this.c = j;
        this.d = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final Map<Integer, ? extends AttachImage> e(w2w w2wVar) {
        String str;
        ArrayList<AttachImage> arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (AttachImage attachImage : arrayList) {
            Image Ab = (attachImage.r.Jb() ? attachImage.r : attachImage.q).Ab();
            Uri parse = (Ab == null || (str = Ab.d) == null) ? null : Uri.parse(str);
            int max = Math.max(Ab != null ? Ab.b : 0, Ab != null ? Ab.c : 0) / 20;
            if (parse == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Bitmap bitmap = (Bitmap) mcr0.i(parse, 0, 0, 0, null, new jwx(3, max)).K().c();
            File c = w2wVar.a1().c("jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(c);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                AttachImage attachImage2 = new AttachImage();
                ImageList imageList = new ImageList(null, 1, null);
                imageList.zb(new Image(Uri.fromFile(c).toString()));
                attachImage2.r = imageList;
                attachImage2.y = attachImage.y;
                attachImage2.x = attachImage.x;
                s3q0 s3q0Var = s3q0.a;
                arrayList2.add(l34.c(w2wVar, attachImage2));
            } finally {
            }
        }
        Iterable iterable = (Iterable) w2wVar.L0(this, new ch30(this.d, arrayList2, AttachUploadingEndpoint.CHANNEL, Long.valueOf(this.c)));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof AttachImage) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        Iterator it2 = arrayList3.iterator();
        ArrayList arrayList4 = new ArrayList(Math.min(c5g.u(arrayList, 10), c5g.u(arrayList3, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList4.add(new Pair(Integer.valueOf(((AttachImage) it.next()).b), (AttachImage) it2.next()));
        }
        return pn00.s(arrayList4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaq0)) {
            return false;
        }
        aaq0 aaq0Var = (aaq0) obj;
        return epx.f(this.b, aaq0Var.b) && this.c == aaq0Var.c && epx.f(this.d, aaq0Var.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + bh10.a(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadBlurAttachmentsCmd(donutAttachments=");
        sb.append(this.b);
        sb.append(", channelId=");
        sb.append(this.c);
        sb.append(", dialogs=");
        return ur.c(sb, this.d, ')');
    }
}
