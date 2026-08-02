package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.core.view.components.radio.VkRadioButton;
import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vf4(int i, int i2, Object obj, boolean z) {
        this.b = i2;
        this.c = z;
        this.e = obj;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                boolean z = this.c;
                String str = (String) this.e;
                int i = this.d;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE audio_book SET is_favorite = ? WHERE uid = ? AND book_id = ?");
                try {
                    V0.bindLong(1, z ? 1L : 0L);
                    V0.D3(2, str);
                    V0.bindLong(3, i);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 1:
                UserId userId = (UserId) this.e;
                ShortVideoPlaylistFullDto shortVideoPlaylistFullDto = (ShortVideoPlaylistFullDto) j5g.a0(((ShortVideoGetPlaylistsResponseDto) obj).d());
                if (shortVideoPlaylistFullDto != null) {
                    return lqe.a(shortVideoPlaylistFullDto, this.c);
                }
                throw new IllegalArgumentException("Can't find any playlist with ownerId: " + userId + " and playlistId: " + this.d);
            default:
                VkRadioButton vkRadioButton = (VkRadioButton) obj;
                vkRadioButton.setChecked(((rg50) this.e).getIntValue() == this.d);
                vkRadioButton.setEnabled(this.c);
                return s3q0.a;
        }
    }

    public /* synthetic */ vf4(rg50 rg50Var, int i, boolean z) {
        this.b = 2;
        this.e = rg50Var;
        this.d = i;
        this.c = z;
    }
}
