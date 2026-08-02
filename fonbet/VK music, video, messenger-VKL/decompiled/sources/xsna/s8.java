package xsna;

import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: AboutVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class s8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // xsna.izs
    public final java.lang.Object invoke(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(Object obj, int i) {
        super(1, obj, com.vk.photos.root.albumdetails.presentation.h.class, "checkShowControls", "checkShowControls(Lcom/vk/photos/root/albumdetails/presentation/AlbumDetailsState;)Z", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, rw4.class, "map", "map(Lcom/vk/api/generated/audio/dto/AudioRestrictionInfoDto;)Lcom/vk/music/offline/configs/api/domain/model/AudioRestrictionInfo;", 0);
                break;
            case 5:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
                super(1, obj, gxe.class, "groupFullDtoToHeaderModel", "groupFullDtoToHeaderModel(Lcom/vk/api/generated/groups/dto/GroupsGroupFullDto;)Lcom/vk/clips/viewer/impl/grid/models/ClipsGridHeaderModel;", 0);
                break;
            case 16:
                super(1, obj, feb0.class, "isPlaying", "isPlaying(Lcom/vk/dto/music/MusicTrack;)Z", 0);
                break;
            case 18:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 19:
                super(1, obj, com.vk.voip.ui.c.class, "updateSecreteHashForAnonymousUser", "updateSecreteHashForAnonymousUser(Ljava/lang/String;)V", 0);
                break;
            default:
                break;
        }
    }
}
