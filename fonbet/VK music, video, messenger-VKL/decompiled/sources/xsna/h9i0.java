package xsna;

import com.vk.api.generated.calls.dto.CallsStartResponseDto;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.List;
import xsna.dum0;
import xsna.jto0;
import xsna.o0x0;
import xsna.o9w0;
import xsna.ogw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h9i0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h9i0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                i9i0 i9i0Var = (i9i0) this.c;
                i9i0Var.b((VkInputSelect) this.d, i9i0Var.g, i9i0Var.i, new cu4(i9i0Var, 8));
                break;
            case 1:
                PhotoAttachment photoAttachment = (PhotoAttachment) this.c;
                cvj0 cvj0Var = (cvj0) this.d;
                Photo photo = photoAttachment.l;
                photo.x = (List) obj;
                photo.m = true;
                cvj0.j7(cvj0Var, photoAttachment);
                break;
            case 2:
                dum0 dum0Var = (dum0) this.c;
                Collection<gum0> collection = (Collection) this.d;
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement(dum0Var.a.d());
                for (gum0 gum0Var : collection) {
                    compileStatement.clearBindings();
                    int ordinal = dum0.a.TYPE.ordinal() + 1;
                    String str = gum0Var.a;
                    fum0 fum0Var = gum0Var.d;
                    compileStatement.bindString(ordinal, str);
                    compileStatement.bindString(dum0.a.NAME.ordinal() + 1, gum0Var.b);
                    compileStatement.bindString(dum0.a.DESCRIPTION.ordinal() + 1, gum0Var.c);
                    compileStatement.bindLong(dum0.a.FLAG_AND.ordinal() + 1, fum0Var.a);
                    compileStatement.bindLong(dum0.a.FLAG_XOR.ordinal() + 1, fum0Var.b);
                    compileStatement.executeInsert();
                }
                compileStatement.close();
                break;
            case 3:
                wh50 wh50Var = (wh50) this.c;
                rg50 rg50Var = (rg50) this.d;
                int intValue = ((Integer) obj).intValue();
                wh50Var.setValue(Boolean.FALSE);
                rg50Var.C(intValue);
                break;
            case 4:
                ((i0b0) this.c).invoke(jto0.b.a((jto0.b) this.d, null, null, null, null, false, null, ((Boolean) obj).booleanValue(), false, false, false, null, false, false, false, null, false, 65471));
                break;
            case 5:
                break;
            case 6:
                e8u0 e8u0Var = (e8u0) this.c;
                e8u0Var.b.W(e8u0Var.a, (MusicTrack) this.d, true, (List) obj);
                break;
            case 7:
                l9w0 l9w0Var = (l9w0) this.c;
                caw0 caw0Var = ((m9w0) this.d).l;
                if (l9w0Var.c) {
                    caw0Var.a.invoke(o9w0.d.b);
                } else {
                    caw0Var.a.invoke(new o9w0.g(l9w0Var.b));
                }
                break;
            case 8:
                mgw0 mgw0Var = (mgw0) this.c;
                rgw0 rgw0Var = (rgw0) this.d;
                mgw0Var.k = null;
                mgw0Var.i.b(new ogw0.c(((CallsStartResponseDto) obj).e()));
                mgw0Var.V(rgw0Var);
                break;
            case 9:
                ((j0x0) this.c).U((s6x0) obj, (o0x0.d) this.d);
                break;
            default:
                String str2 = (String) this.c;
                y4x0 y4x0Var = (y4x0) this.d;
                L.f("VVMOpponentAvatarDelegate", "Failed to load opponent avatar from " + str2, (Throwable) obj);
                y4x0Var.g = null;
                break;
        }
        return s3q0.a;
    }
}
