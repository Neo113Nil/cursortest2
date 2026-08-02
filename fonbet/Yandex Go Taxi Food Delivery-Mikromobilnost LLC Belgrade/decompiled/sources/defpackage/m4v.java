package defpackage;

import com.yandex.delivery.mapper.model.LocalIconName;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.LocalIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.RemoteIconDto;

/* loaded from: classes5.dex */
public final class m4v {
    public final vdc a;

    public m4v(vdc vdcVar) {
        this.a = vdcVar;
    }

    public final w4v a(IconDto iconDto) {
        if (iconDto instanceof IconDto.Icon_RemoteIconDto) {
            return b(((IconDto.Icon_RemoteIconDto) iconDto).b);
        }
        if (iconDto instanceof IconDto.Icon_LocalIconDto) {
            LocalIconDto localIconDto = ((IconDto.Icon_LocalIconDto) iconDto).b;
            String name = localIconDto.getName();
            LocalIconName.Companion.getClass();
            return new h3z(i3z.a(name), localIconDto.getAccessibilityLabel(), localIconDto.getMonochrome());
        }
        if (iconDto instanceof IconDto.Unknown_IconDto) {
            return null;
        }
        w511.b();
        return null;
    }

    public final mvi0 b(RemoteIconDto remoteIconDto) {
        qfc qfcVar;
        String tagDay = remoteIconDto.getTagDay();
        String tagNight = remoteIconDto.getTagNight();
        String url = remoteIconDto.getUrl();
        ColorDto tintColor = remoteIconDto.getTintColor();
        if (tintColor != null) {
            this.a.getClass();
            qfcVar = vdc.a(tintColor);
        } else {
            qfcVar = null;
        }
        return new mvi0(tagDay, tagNight, url, qfcVar, remoteIconDto.getAccessibilityLabel(), remoteIconDto.getMonochrome());
    }
}
